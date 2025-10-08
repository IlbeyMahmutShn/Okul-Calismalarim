//Klavyeden girilen pozitif bir tam sayını asal olup olmadığını ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();

        if (number >= 2) {

            for (int index = 2; index < number; index++) {

                if (number % index == 0) {
                    System.out.println("Girilen sayı asal sayı değildir");break;
                }
            }
        }
        else{
            System.out.println("2'den küçük sayılar pozitif asal sayı değildir");
        }
        System.out.println("Girilen sayı asal sayıdır");
    }
}
