//Ekrana 10 tane sayı girilecek 50 ile 75 arasında kaç tane tek sayı 80 ile 100 arasında kaç tane çift sayı olduğunu bulan ve bu sayıların ortalamasını alan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number , average = 0 , numberHolder1 = 0 , numberHolder2 = 0 , total1 = 0 , total2 = 0;

        for (int index = 0; index < 10; index++) {
            System.out.println("lütfen bir sayı giriniz");
            number = scanner.nextInt();

            if (number % 2 == 1 && number >= 50 && number <= 75){
                numberHolder1++;
                total1 = total1 + number;
            }
            if (number % 2 == 0 && number >= 80 && number <= 100){
                numberHolder2++;
                total2 = total2 + number;
            }
        }
        average = (total1 + total2) / (numberHolder1 + numberHolder2);
        System.out.println("Uyuşan sayı adeti :" + (numberHolder1 + numberHolder2) + "  " + "Uyuşan sayıların ortalamsı :" + average);
    }
}