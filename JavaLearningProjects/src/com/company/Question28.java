package com.company;

import java.util.Random;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int d[] = new int[5];
        int d1[] = new int [5];
        int d2[] = new int [d.length];

        for (int index = 0; index < d.length; index++) {
            System.out.println("Lütfen bir dizi değeri giriniz");
            d[index] = keyboard.nextInt();
            System.out.println("Lütfen bir dizi değeri giriniz");
            d1[index] = keyboard.nextInt();

            if (d[index] > d1[index]) {
                System.out.println(d[index]);

            }
            else {
                System.out.println(d1[index]);
            }
        }
    }
}