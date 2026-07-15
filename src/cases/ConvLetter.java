package cases;

import java.util.Scanner;

public class ConvLetter {
    static void main() {
        // switch - Harflarni Ugiriw Dasturi

        Scanner input = new Scanner(System.in);
        String letter = input.next();

        switch (letter) {
            case "B":
                IO.println("Б"); break;
            case "D":
                IO.println("Д"); break;
            case "E":
                IO.println("Э"); break;
            case "F":
                IO.println("Ф"); break;
            case "G":
                IO.println("Г"); break;
            case "I":
                IO.println("И"); break;
            case "J":
                IO.println("Ж"); break;
            case "L":
                IO.println("Л"); break;
            case "N":
                IO.println("Н");  break;
            case "P":
                IO.println("П"); break;
            case "Q":
                IO.println("К"); break;
            case "R":
                IO.println("Р"); break;
            case "S":
                IO.println("С"); break;
            case "U":
                IO.println("У"); break;
            case "V":
                IO.println("В"); break;
            case "Y":
                IO.println("Е, Й, Я, Ю"); break;
            case "Z":
                IO.println("З"); break;
            default: {
                IO.println("Xato");
            }
        }
    }
}
