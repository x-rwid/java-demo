package demoforeignfunction;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import static java.lang.foreign.MemoryLayout.*;

public class CalcFractionSlice {
    static void main() {

        try (Arena arena = Arena.ofShared()) {
            MemoryLayout fractionLayout = MemoryLayout.structLayout(
                    ValueLayout.JAVA_INT.withName("numerator"),
                    ValueLayout.JAVA_INT.withName("denominator"));

            long fractionSize = fractionLayout.byteSize();
            int amount = 20;

            // tutaw memory block'da 20 ta kasr ucun memory allocate'law
            MemorySegment fractionsSegment = arena.allocate(fractionLayout.byteSize() * amount);

            // field'larga kiriw ucun VarHandle'lar
            VarHandle numeratorHandle = fractionLayout.varHandle(PathElement.groupElement("numerator"));
            VarHandle denominatorHandle = fractionLayout.varHandle(PathElement.groupElement("denominator"));

            // kasrlarni namunaviy qiymatlar ila bowlaw (masalan (1/2), (2/3) va hokazo)
            for (int i = 0; i < amount; i++) {
                MemorySegment fractionSlice = fractionsSegment.asSlice(i * fractionSize, fractionSize);
                numeratorHandle.set(fractionSlice, 0, i + 1);
                denominatorHandle.set(fractionSlice, 0, (i + 2));
            }

            for (int i = 0; i < amount; i++) {
                MemorySegment fractionSlice = fractionsSegment.asSlice(i * fractionSize, fractionSize);
                int numerator = (int) numeratorHandle.get(fractionSlice, 0);
                int denominator = (int) denominatorHandle.get(fractionSlice, 0);
                IO.println("Kasr " + i + ": " + numerator + "/" + denominator);
            }
        }
    }
}