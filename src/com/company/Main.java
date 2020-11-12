package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int testArray[] = new int[10];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(99);
            System.out.println(testArray[i] + " ");
        }

        for (int i = 0; i < testArray.length; i++) {
            sum += testArray[i];
        }
    }
}
