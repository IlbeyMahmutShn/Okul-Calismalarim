package com.company;

import java.util.Random;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dizinin uzunluğunu giriniz");
        int d[] = new int[keyboard.nextInt()];
        Random r = new Random();

        for (int index = d.length -1; index >= 0; index--) {
            d[index] = r.nextInt(10);
            System.out.println("Dizinin elemanı : " + index + "elemaın : " + d[index]);
        }
    }
}
