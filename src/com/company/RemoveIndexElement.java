package com.company;

import java.util.Random;
import java.util.Scanner;

public class RemoveIndexElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] intArray = new int[10];
        int[] newArray = new int[intArray.length - 1];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(99);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        int remove;
        boolean contains = false;

        while (!contains) {
            System.out.println("Choose element to remove: ");
            remove = scanner.nextInt();
            for (int i = 0; i < intArray.length; i++) {
                if (remove == intArray[i]) {
                    contains = true;
                }
            }
            for (int i = 0; i < intArray.length; i++) {
                if (remove == intArray[i]) {
                    continue;
                } else {
                    int j = 0;
                    newArray[j] = intArray[i];
                    j++;
                }

            }
        }


        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }

    }
}