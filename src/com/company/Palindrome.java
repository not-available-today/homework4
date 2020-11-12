package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String userInputString;
        Scanner scanner = new Scanner(System.in);

        boolean isPalindrome = true;

        while (true) {
            System.out.println("Enter a string: ");
            userInputString = scanner.nextLine();
            for (int i = 0; i < userInputString.length(); i++) {
                if (userInputString.charAt(i) != userInputString.charAt(userInputString.length() - 1 - i)) {
                    System.out.println("String is not a palindrome.");
                    isPalindrome = false;
                    break;
                }


            }

            if (isPalindrome) {
                System.out.println("String is a palindrome.");
            }

        }
    }
}
