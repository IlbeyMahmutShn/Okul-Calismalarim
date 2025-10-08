//Klavyeden girilen 10 tane sayı giriliyor yaşı en büyük olanı bulan ve kaçıncı okişi olduğunu bulan
package com.company;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = keyboard.nextInt();
        int enb = number;
        int enbIndis=1;

        for (int index = 2; index <= 5; index++) {
            System.out.println("Lütfen bir sayı giriniz");
            number = keyboard.nextInt();
            if (number > enb) {
                enb = number;
                enbIndis=index;
            }
        }
        System.out.println(enb + " " + enbIndis);
    }
}
