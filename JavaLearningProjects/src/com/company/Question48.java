package com.company;

import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.println("1. En büyük sayıyı bulma  2. En küçük sayıyı bulma  3. Girilen sayıların ortalamasını bulma  Döngüden çıkmak için sıfır giriniz.");
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();

            if (number == 1) {
                biggestNumberFinder();
            } else if (number == 2) {
                littleNumberFinder();
            } else if (number == 3) {
                averageFinder();
            } else {
                System.out.println("Lütfen 0 ile 4 arasında sayı giriniz");
            }
        }
        while (number != 0);
    }

    public static void biggestNumberFinder() {
        Scanner keyboard = new Scanner(System.in);
        int number , biggestNumber;
        System.out.println("Lütfen bir sayı giriniz");
        biggestNumber = keyboard.nextInt();

        do {
            System.out.println("Lütfen bir sayı giriniz");
            number = keyboard.nextInt();

            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        while (number != 0);
        System.out.println("En büyük sayı : " + biggestNumber);
    }

    public static void littleNumberFinder() {
        Scanner keyboard = new Scanner(System.in);
        int number , littleNumber;
        System.out.println("Lütfen bir sayı giriniz");
        littleNumber = keyboard.nextInt();

        do {
            System.out.println("Lütfen bir sayı giriniz");
            number = keyboard.nextInt();

            if (littleNumber > number && number != 0) {
                littleNumber = number;


            }
        }
        while (number != 0);
        System.out.println("En küçük sayı : " + littleNumber);
    }

    public static void averageFinder() {
        Scanner keyboard = new Scanner(System.in);
        int number , total = 0 , average , numberHolder = 0;

        do {
            System.out.println("Lütfen bir sayı giriniz");
            number = keyboard.nextInt();
            numberHolder++;
            total += number;
            average = total / numberHolder;
        }
        while (number != 0);
        System.out.println(average);

    }
}

