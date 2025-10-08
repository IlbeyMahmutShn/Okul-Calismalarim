package com.company;

public class Question35 {
    public static void main(String[] args) {
        int total = 0;
        int factorial = 1;
        int multiplication = 1;
        int us = 1;
        int i , j;

        for (int index = 1; index <= 3; index++) {

            for (int jindex = 2; jindex <= 4; jindex++) {
                i = index;
                j= jindex;

                while (i > 0) {
                    factorial = factorial * i;
                    i--;
                }

                while (j > 0) {
                    us = us * j;
                    j--;
                }

                multiplication *= (factorial + us);
                factorial = 1;
                us = 1;

            }
            total= total + multiplication;
            multiplication =1;
        }
        System.out.println("Sonuç : " + total);
    }
}