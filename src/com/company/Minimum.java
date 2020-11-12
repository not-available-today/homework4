package com.company;

import java.util.Random;

public class Minimum {
    public static void main(String[] args) {
        int sample[] = new int[10];
        Random random = new Random();
        int min;


        for (int i = 0; i < 10; i += 1) {
            sample[i] = random.nextInt(99);
        }
        for (int i = 0; i < sample.length; i++) {
            System.out.print(sample[i] + " ");
        }
        min = sample[0];
        for (int i = 0; i < 10; i += 1) {
            if (sample[i] < min) min = sample[i];
        }
        System.out.println("Array minimum: " + min);
    }
}


