package com.company;

import java.util.Random;

public class DuplicateRemoval {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] newArray = new int[array.length - 1];
        int duplicate = 0;
        int j = 0;
        Random random = new Random();

        //populates array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);
        }
        //prints array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //finds duplicate
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if ((array[i] == array[k]) && (i != k)) {
                    duplicate = array[k];
                    System.out.println("\nduplicate element :" + duplicate);
                }
            }

        }

        //removes duplicate
       for (int i = 0; i < array.length; i++) {
           if (duplicate == array[i]) {
               continue;
           } else {
               newArray[j] = array[i];
               j++;
           }

       }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }
    }
}
