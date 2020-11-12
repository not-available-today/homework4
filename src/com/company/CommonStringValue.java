package com.company;

public class CommonStringValue {
    public static void main(String[] args) {
        String[] cars = {"Mercedes", "BMW", "Volkswagen","Ferrari","Porsche","Rolls Royce","Toyota"};
        String[] stripperNames = {"Alexis", "Tatiana","Mercedes","Porsche","Candy","Trixie"};

        System.out.println("\n\nHere is a list of car brands: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + ", ");
        }

        System.out.println("\n\nHere is a list of stripper names: ");
        for (int i = 0; i < stripperNames.length; i++) {
            System.out.print(stripperNames[i] + ", ");
        }

        System.out.println("\n\nLet's see how many items the two have in common!");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < stripperNames.length; j++) {
                if(cars[i] == stripperNames[j]){
                    System.out.println("Here is one: " + cars[i]);
                }

            }

        }
    }
}
