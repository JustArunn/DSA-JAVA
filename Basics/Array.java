package Basics;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("taking input in array");
        int[] arr2 = new int[5];
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++)
                arr2[i] = in.nextInt();
        }
        System.out.println("Printing Array of input");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
