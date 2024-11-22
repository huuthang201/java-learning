package org.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("length of array: " + numbers.length);
        System.out.println("Max value: " + Arrays.stream(numbers).max());
        System.out.println("Min value: " + Arrays.stream(numbers).min());
        System.out.println("Sort array: " + Arrays.toString(Arrays.stream(numbers).sorted().toArray()));
    }
}
