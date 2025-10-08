package com.company;

import java.util.Scanner;

public class Question30 {
    public static void main(String[]args) {
        Scanner Keyboard = new Scanner(System.in);
        int number1 , number2 , işlem ;
        System.out.println("Lütfen bir sayı giriniz");
        number1 = Keyboard.nextInt();
        System.out.println("İşlem seçiniz");
        işlem = Keyboard.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        number2 = Keyboard.nextInt();

        switch (işlem) {
            case 1 -> System.out.println("Sayıların toplamı :" + (number1 + number2));
            case 2 -> System.out.println("Sayıların farkı :" + (number1 - number2));
            case 3 -> System.out.println("Sayıların çarpımı :" + (number1 * number2));
            default -> System.out.println("Sayıların bölümü :" + (number1 / number2));
        }

    }

}