package demoforeignfunction;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import static java.lang.foreign.MemoryLayout.*;

public class CalcFractionSeq {
    static void main() {

        try (Arena arena = Arena.ofConfined()) {
            // kasr ucun layout belgilaw (2 ta integer: surat va maxraj)
            MemoryLayout fractionLayout = MemoryLayout.structLayout(
                    ValueLayout.JAVA_INT.withName("numerator"),
                    ValueLayout.JAVA_INT.withName("denominator"));

            // 20 ta kasrni saqlaw ucun sequence layout tuziw
            SequenceLayout fractionArrayLayout = MemoryLayout.sequenceLayout(20, fractionLayout);

            // 20 ta kasr ucun memory allocate'law
            MemorySegment segment = arena.allocate(fractionArrayLayout);
            SegmentAllocator allocator = SegmentAllocator.slicingAllocator(segment);

            // har bir kasr ucun MemorySegment'larni array'ini tuziw
            MemorySegment[] fractions = new MemorySegment[20];

            // field'larga kiriw ucun VarHandle'lar
            VarHandle numeratorHandle = fractionLayout.varHandle(PathElement.groupElement("numerator"));
            VarHandle denominatorHandle = fractionLayout.varHandle(PathElement.groupElement("denominator"));

            // kasrlarni qiymatlar ila bowlaw (masalan (1/2), (3/4) va hokazo)
            for (int i = 0; i < 20; i++) {
                fractions[i] = allocator.allocate(fractionLayout);
                numeratorHandle.set(fractions[i], 0, i + 1);
                denominatorHandle.set(fractions[i], 0, (i + 2));
            }

            MemorySegment resultFraction = arena.allocate(fractionLayout);

            for (int i = 0; i < 20; i += 2) {

                int n1 = (int) numeratorHandle.get(fractions[i], 0);
                int d1 = (int) denominatorHandle.get(fractions[i], 0);
                int n2 = (int) numeratorHandle.get(fractions[i + 1], 0);
                int d2 = (int) denominatorHandle.get(fractions[i + 1], 0);

                int resultNumerator = (n1 * d2) + (n2 * d1);
                int resultDenominator = d1 * d2;

                // natijani resultFraction'da saqlaw
                numeratorHandle.set(resultFraction, 0L, resultNumerator);
                denominatorHandle.set(resultFraction, 0L, resultDenominator);

                // oliw va natijani print qiliw
                IO.println("Natija Kasri: " +
                        numeratorHandle.get(resultFraction, 0L) + "/" +
                        denominatorHandle.get(resultFraction, 0L));
            }
        }
    }
}
