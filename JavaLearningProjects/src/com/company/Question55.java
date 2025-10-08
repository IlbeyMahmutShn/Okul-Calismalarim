//Klavyeden girilen fiyatı KDV(%18) ekleyerek ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question55 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir fiyat giriniz");
        int number = keyboard.nextInt();

        System.out.println("KDV dahil fiyatı :" + (number + number * 18 / 100));
    }
}
