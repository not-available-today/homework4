package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexIndicator {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(99);
            System.out.print(myArray[i] + " ");
        }

        boolean flag = false;
        while (true) {
            System.out.println("\nWhich array element would you like to examine?");
            int userNumber = scanner.nextInt();
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] == userNumber) {
                    System.out.println("Index[" + j + "]:" + myArray[j]);
                    flag = true;
                }
            }
            if (flag != true){
                System.out.println("Wrong number, try again.");
            }
        }

    }

}
