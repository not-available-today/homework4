package com.company;

import java.util.Random;

public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = new int[10];
        int[] duplicateArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(99);
        }

        for (int i = 0; i < originalArray.length; i++) {
            duplicateArray[i] = originalArray[i];
        }

        System.out.println("Original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println("\nDuplicate array: ");
        for (int i = 0; i < duplicateArray.length; i++) {
            System.out.print(duplicateArray[i] + " ");
        }

    }
}
