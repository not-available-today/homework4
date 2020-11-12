package com.company;

import java.util.Random;

public class ArrayAvg {
    public static void main(String[] args) {

        int array1[] = new int[10];
        int avg, sum = 0;

        Random random1 = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt(99);
            System.out.println(array1[i] + " ");
        }



        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        avg = sum / array1.length;
        System.out.println(avg);
    }
}


