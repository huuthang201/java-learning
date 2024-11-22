package org.example;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your electricity bill amount: ");
        int choice = scanner.nextInt();
        System.out.println("enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("check choice in the array: ");
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == choice) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("choice is in the array");
        } else {
            System.out.println("choice is not in the array");
        }

    }
}
