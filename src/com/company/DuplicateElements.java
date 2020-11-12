package com.company;

import java.util.Random;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(20)+10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if((array[i] == array[j]) && (i != j) ){
                    System.out.print("\nduplicate element: " + array[j] + " ");
                }


            }

        }
    }
}
