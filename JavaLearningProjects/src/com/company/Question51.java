//Girilen vize ve final notlarına göre öğrencinin dersten geçip geçemediğini bulan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen vize notunu giriniz");
        int number = keyboard.nextInt();
        System.out.println("Lütfen final notunu giriniz");
        int number2 = keyboard.nextInt();

        if (number * 40 / 100 + number2 * 60 / 100 >= 50 && number2 >= 50) {
            System.out.println("Dersi geçtiniz");
        }
        else {
            System.out.println("Dersi geçemediniz");
        }
    }
}
