//Klavyeden 0 girilmediği müddetçe girilen sayıları toplayan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int toplam = 0;
        int i = 1;
        do{
            System.out.println("Lütfen bir sayı giriniz");
            number = scanner.nextInt();
            toplam = toplam + number;
            i++;

        } while (number != 0);
        System.out.println("Girilen" + i + "sayının toplamı :"+ (toplam));
    }
}