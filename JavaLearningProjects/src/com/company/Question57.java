//Ekrana 10 tane sayı girilecek 50 ile 65 arasında kaç tane sayı olduğunu ve bu sayıların ortalamasını bulan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number , average , numberHolder = 0 , total= 0;
        for (int index = 0; index < 10; index++){
            System.out.println("Lütefen bir sayı giriniz");
            number = scanner.nextInt();
            if (number >= 50 && number <= 75){
                numberHolder++;
                total = total + number;
            }
        }
        average = total / numberHolder;
        System.out.println("Uyuşanm sayı adedi :" + numberHolder + " " + "Uyuşan sayuıların ortalaması :" + average);
    }
}

