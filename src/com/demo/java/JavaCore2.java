package com.demo.java;

import java.util.Scanner;

public class JavaCore2 {
    static void main() {
        // method'larni to'g'rilawim kerak!!!

        // 1-Mavwq: Masofani Hisablaw
        Scanner scan = new Scanner(System.in);

        IO.print("x1 ni kiritin: ");
        double x1 = scan.nextDouble();
        IO.print("y1 ni kiritin: ");
        double y1 = scan.nextDouble();
        IO.print("x2 ni kiritin: ");
        double x2 = scan.nextDouble();
        IO.print("y2 ni kiritin: ");
        double y2 = scan.nextDouble();

        double masofa = calculateDistance(x1, y1, x2, y2);
        IO.println("Masofa: " + masofa);
        IO.println();
    }

    // 1-Mawq ucun method
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // 2-Mawq: Doira Maydoni
    static void main1() {
        Scanner scan1 = new Scanner(System.in);

        IO.print("Radius'ni kiritin: ");
        if (scan1.hasNextDouble()) {
            double radius = scan1.nextDouble();
            double area = calculateCircleArea(radius);

            if (area == -1) {
                IO.println("Error: Radius manfiy bo'liwi mumkin emas.");
            } else {
                IO.println("Maydon: " + area);
            }
        } else {
            IO.println("Error: Kiritilgan ma'lumat xato. Iltimos, haqiqiy son kiritin.");
            scan1.next();
        }
        IO.println();
    }

    // 2-Mawq ucun method
    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            return -1;
        } else if (radius == 0) {
            return 0.0;
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    // 3-Mawq: Tana Yalpi Hisablagic
    static void main3() {
        Scanner scan = new Scanner(System.in);

        IO.print("Vaznni kilo'da kiritin: ");
        double weight = scan.nextDouble();
        IO.print("Bo'yni metr'da kiritin: ");
        double height = scan.nextDouble();

        double bmi = calculateBMI(weight, height);
        if (bmi != -1) {
            IO.println("Tanani Yalpi Miqdari: " + bmi);
        } else {
            IO.println("Error: Bo'y 0 dan yuqori bo'liwi kerak.");
        }
    }

    // 3-Mawq ucun method
    public static double calculateBMI(double weight, double height) {
        if (height > 0) {
            return weight / (height * height);
        } else {
            return -1;
        }
    }

    // 4-Mawq: Kalitso'zni Tasdiqlovci Dastur
    static void main4() {
        Scanner scan = new Scanner(System.in);

        IO.print("Kalitso'zni kiritin: ");
        scan.nextLine(); // buffer'ni tozalaw ucun
        String password = scan.nextLine();

        boolean isValid = isValidPassword(password);
        IO.println(isValid);
    }

    // 4-Mawq ucun method
    public static boolean isValidPassword(String password) {
        if (password.length() < 4) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        String specialChars = ".,!?:;'`<>()[]{}+-/*=%^~_&|#$@";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            else if (Character.isLowerCase(ch)) hasLowerCase = true;
            else if (Character.isDigit(ch)) hasDigit = true;
        }
        return hasUpperCase && hasLowerCase && hasDigit && password.length() >= 4;
    }

    // 5-Mawq: So'zni Teskari Ugiriw
    static void main5() {
        Scanner scan = new Scanner(System.in);

        IO.print("So'zni kiritin: ");
        String word = scan.nextLine();
        String reversed = reverString(word);
        IO.println("Teskarisi: " + reversed);
    }

    // 5-Mawq ucun method
    public static String reverString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    // 6-Mawq: Mantiqiy Sinov Dasturi
    static void main6() {
        Scanner scan = new Scanner(System.in);

        IO.print("1ci mantiqiy qiymatni kiritin: ");
        boolean b1 = scan.nextBoolean();
        IO.print("2ci mantiqiy qiymatni kiritin: ");
        boolean b2 = scan.nextBoolean();

        String result = checkBooleans(b1, b2);
        IO.println(result);
    }

    // 6-Mawq ucun method
    public static String checkBooleans(boolean b1, boolean b2) {
        boolean andResult = b1 && b2;
        boolean orResult = b1 || b2;
        return "VA " + andResult + " YO " + orResult;
    }

    // 7-Mawq: Fahrenheit Bo'yica Harorotni Celsi'ga Ayalantiriw
    static void main7() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fahrenheit bo'yica harorotni kiritin: ");
        if (scan.hasNextDouble()) {
            double fahrenheit = scan.nextDouble();
            double celcius = fahrenheitToCelsius(fahrenheit);
            IO.println("Celci bo'yica harorot: " + celcius);
        } else {
            IO.println("Error: Xato ma'lumat kiritildi.");
        }
    }

    // 7-Mawq ucun method
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // 8-Mawq - Hisablaw Dasturi
    static void main8() {
        Scanner scan = new Scanner(System.in);

        IO.print("1ci sonni kiritin: ");
        int number1 = scan.nextInt();
        IO.print("2ci sonni kiritin: ");
        int number2 = scan.nextInt();

        String result2 = calculateOperations(number1, number2);
        IO.println(result2);

        scan.close();
    }

    // 8-Mawq ucun method
    public static String calculateOperations(int a, int b) {
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        String divisionResult;

        if (b != 0) {
            divisionResult = String.valueOf((double) a / b);
        } else {
            divisionResult = "Taqsimlaw mumkin emas.";
        }
        return " Yig'indi: " + sum +
                " Ayirma: " + subtraction +
                " Ko'paytma: " + multiplication +
                " Taqsim: " + divisionResult;
    }
}

