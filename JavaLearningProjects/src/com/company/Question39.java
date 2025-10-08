package com.company;

import java.util.Scanner;

public class Question39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int index = number; index < 100; index++) {
            if (index == 0 || index == 1){

            }
            isPrime = true;
            for (int x = 2; x < index; x++) {
                if (index % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(index);
            }
        }
    }
}
