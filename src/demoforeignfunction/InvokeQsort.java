package demoforeignfunction;

import java.lang.foreign.*;
import java.lang.invoke.*;

public class InvokeQsort {

    class Qsort {
        static int qsortCompare(MemorySegment elem1, MemorySegment elem2) {
            return Integer.compare(elem1.get(ValueLayout.JAVA_INT, 0), elem2.get(ValueLayout.JAVA_INT, 0));
        }
    }

    // native linker'ni instance'ini oliw
    final static Linker linker = Linker.nativeLinker();

    static int[] qsortTest(int[] unsortedArray) throws Throwable {

        int[] sorted = null;

        // qsort ucun downcall handle tuziw
        MethodHandle qsort = linker.downcallHandle(
                linker.defaultLookup().find("qsort").get(),
                FunctionDescriptor.ofVoid(ValueLayout.ADDRESS,
                        ValueLayout.JAVA_LONG,
                        ValueLayout.JAVA_LONG,
                        ValueLayout.ADDRESS));

        // qsortCompare ucun method handle tuziw
        MethodHandle comparHandle = MethodHandles.lookup()
                .findStatic(Qsort.class,
                        "qsortCompare",
                        MethodType.methodType(int.class,
                                MemorySegment.class,
                                MemorySegment.class));

        // Java method tomonidan tatbiq etilgan C function'ni Java tavsifini tuziw
        FunctionDescriptor qsortCompareDesc = FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT));

        // qsortCompare ucun function pointer tuziw
        MemorySegment compareFunc = linker.upcallStub(comparHandle,
                qsortCompareDesc,
                Arena.ofAuto());

        try (Arena arena = Arena.ofConfined()) {

            // off-heap memory allocate'law va unda unsortedArray'ni saqlaw
            MemorySegment array = arena.allocateFrom(ValueLayout.JAVA_INT,
                    unsortedArray);

            // qsort'ga call
            qsort.invoke(array,
                    (long) unsortedArray.length,
                    ValueLayout.JAVA_INT.byteSize(),
                    compareFunc);

            // off-heap memory'ga kiriw
            sorted = array.toArray(ValueLayout.JAVA_INT);
        }
        return sorted;
    }

    static void main(String[] args) {
        try {
            int[] sortedArray = InvokeQsort.qsortTest(new int[]{0, 9, 3, 4, 6, 5, 1, 8, 2, 7});
            for (int num : sortedArray) {
                IO.print(num + " ");
            }
            IO.println();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
