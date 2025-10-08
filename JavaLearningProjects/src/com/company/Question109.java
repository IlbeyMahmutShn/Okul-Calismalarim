//Klavyeden girilen pozitif tam sayıların basamaklarındaki sayıların toplamını ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();
        int total = 0;

        while (number > 0){
            total = total + (number % 10);
            number /= 10;

        }
        System.out.println("Basamaklar toplamı :" + total);
    }
}