package com.company;

import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number , number2 , number3 = 1;
        System.out.println("Lütfen bir sayı giriniz");
        number = scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        number2 = scanner.nextInt();

        for (int index = 1; index <= number2; index++) {
            number3 = number3 * number;


        }
        System.out.println(number3);
    }
}
