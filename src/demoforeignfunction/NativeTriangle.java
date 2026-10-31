package demoforeignfunction;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;

public class NativeTriangle {

    static void main(String[] args) throws Throwable {
        String pattern = (args.length > 0) ? args[0] : "********";
        invokeStrdup(pattern);
    }

    private static void invokeStrdup(String pattern) throws Throwable {
        try (Arena arena = Arena.ofConfined()){

            // off-heap memory'ni allocate'law, argument'ni va Java string'ni off-heap memory'ga copy'alaw
            MemorySegment nativeString = arena.allocateFrom(pattern);

            // native linker'ni instance'ini oliw
            Linker linker = Linker.nativeLinker();

            // C function imzosini address'ini oliw
            SymbolLookup stdLib = linker.defaultLookup();
            MemorySegment strdup_addr = stdLib.find("_strdup").get(); // Linux va macOS'da "strdup" yoziladi

            // C function tavsifini tuziw
            var layout = MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE);
            FunctionDescriptor strdup_sig = FunctionDescriptor.of(
                    ValueLayout.ADDRESS.withTargetLayout(layout),
                    ValueLayout.ADDRESS.withTargetLayout(layout));

            // C function ucun downcall handle tuziw
            MethodHandle strdup_handle = linker.downcallHandle(strdup_addr, strdup_sig);

            // C function'ni Java'dan be vasita caqiriw
            MemorySegment duplicatedAddress = (MemorySegment) strdup_handle.invokeExact(nativeString);

            for (int i = pattern.length() - 1; i >= 0; i--) {
                IO.println(duplicatedAddress.getString(i));
            }
        }
    }
}
