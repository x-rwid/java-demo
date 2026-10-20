package com.demo.java;

import java.util.Arrays;

public class Calculator {
    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = sum(numbers);
        return (double) sum / numbers.length;
    }

    private static int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
