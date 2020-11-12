package com.company;

import java.util.Random;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = new int[10];
        int largest = 0, second = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                second = largest;
                largest = array[i];
            } else if (array[i] > second) {
                second = array[i];
            }

        }

        System.out.println("\nSecond largest number in array:" +second);
    }
}
