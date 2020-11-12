package com.company;

import java.util.Random;
import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] intArray = new int[10];
        int[] newArray = new int[intArray.length - 1];
        int j = 0;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(99);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        boolean contains = false;

        while (true) {
            int remove = scanner.nextInt();
            for (int i = 0; i < intArray.length; i++) {
                if (remove == intArray[i]) {
                    contains = true;
                }

            }
            if (contains != true) {
                System.out.println("Please re-enter a correct number.");
                continue;
            }
            for (int i = 0; i < intArray.length; i++) {
                if (remove == intArray[i]) {
                    continue;
                } else {
                    newArray[j] = intArray[i];
                    j++;
                }

            }
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");

            }

            break;
        }
    }

}
