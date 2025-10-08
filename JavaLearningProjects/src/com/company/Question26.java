package com.company;

import java.util.Random;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen dizinin uzunluğunu giriniz");
        int d[] = new int[keyboard.nextInt()];
        Random r = new Random();

        for (int index = 0; index < d.length; index++) {
            d[index] = r.nextInt(10);

            for (int jindex = index + 1; jindex < d.length; jindex++) {

                if (d [index] == d [jindex]) {
                    System.out.println("Dizinin : " + d[index] + "den ");
                }
            }
        }
    }
}
