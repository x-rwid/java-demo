package demoforeignfunction;

import java.lang.foreign.*;
import java.lang.invoke.*;

public class NativeMalloc {
    static void main() throws Throwable {

        String s = "Panama project ajoyib!";

        // native linker'ni instance'ini oliw
        Linker linker = Linker.nativeLinker();

        // malloc()ni address'ini topiw
        var malloc_addr = linker.defaultLookup().find("malloc").orElseThrow();

        // malloc() ucun downcall handle tuziw
        MethodHandle malloc = linker.downcallHandle(malloc_addr,
                FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));

        long byteSize = ValueLayout.JAVA_CHAR.byteSize() * (s.length() + 1);

        // pointer'ni qaytaradigan malloc() invoke qiliw
        MemorySegment segment = (MemorySegment) malloc.invokeExact(byteSize);

        // malloc() tomonidan tuzilgan memory segment'ni size'i
        IO.println(
                "malloc.invokeExact'ni caqiriw orqali tuzilgan memory segment'ni byte'lardagi size'i(" +
                        byteSize + "): " + segment.byteSize());
    }
}
