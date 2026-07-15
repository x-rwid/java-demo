package cases;

public class ArrNum {
    static void main() {
        // 1D Array - uni uzunligini, bow sonini va yig'indisini topiw dasturi

        int a[] = {1, 4, 0, 5, 7, 3, 9, 2, 8, 18, 90, 6}; // static uslub
        IO.println("array'ni uzunligi: " + a.length); // avvalo array uzunligini aniqlaw kerak
        IO.println("array'ni 1ci index'i: " + a[0]); // array index'ini aniqlaw

        // array'dagi raqamlar yig'indisini hisablaw
        int sum = 0;                         // loop'da i ni owib boruvci qiymatini yig'indisi 0 dan bowlaw
        for (int i = 0; i < a.length; i++) { // loop'da 0 dan 10 gaca qiymatlar owib boriwi
            sum += a[i];                     // har loop'da i ni qiymati owganda kerak bo'lgan qiymatni olib beradi
        }
        IO.println("array'ni yig'indisi: " + sum); // array'ni yig'indisini cop etiw
    }
}
