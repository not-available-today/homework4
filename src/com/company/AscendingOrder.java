package com.company;

import java.util.Random;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int compare;
        Random random = new Random();

        System.out.println("Original array is: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(89)+10;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i]);

        }
        for (int i = 1; i < intArray.length; i++) {
            for (int j = intArray.length - 1; j >= i; j--) {
                if (intArray[j - 1] < intArray[j]) {
                    compare = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = compare;
                }

            }

        }

        System.out.println("\n\nSorted array is:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i]);


        }

    }
}
