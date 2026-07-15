package classes;

public class DataStructure {

    // array tuziw
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // array'ni o'sib boruvci integer qiymatlari ila to'ldiriw
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // array'ni juft index'larini qiymatlarini cop etiw
        DataStructureIterator iterator = this.new DataEvenIterator();
        while (iterator.hasNext()) {
            IO.print(iterator.next() + " ");
        }
        IO.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    /*
    inner class Iterator<Integer> interface'ini kengaytiradigan DataStructureIterator interface'ini tatbiq etadi,
    EvenIterator class'i be vasita DataStructure object'ini arrayOfInts no static field'iga tegiwli.
     */

    private class DataEvenIterator implements DataStructureIterator {

        // array'ni bowidan bowlab bosqicma bosqic bajariwni bowlaw
        private int nextIndex = 0;
        public boolean hasNext() {

            // joriy element array'dagi oxirgi element ekanligini tekwiriw
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // array'ni juft index'ini qiymatini yozib oliw
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // keyingi juft element'ni oliw
            nextIndex += 2;
            return retValue;
        }
    }

    static void main() {

        // array'ni integer qiymatlar ila to'diriw va faqat juft index'larni qiymatlarini cop etiw
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
