package com.company;

import java.util.Scanner;

public class Question87 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number , number2 , t;
        System.out.println("Lütfen bir sayı giriniz");
        number = keyboard.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        number2 = keyboard.nextInt();
        total(number , number2);
        t = total(number ,number2);
        System.out.println(t);
    }

    public static int total(int number , int number2) {
        int toplam;
        toplam = number + number2;

        return toplam;
    }
}
