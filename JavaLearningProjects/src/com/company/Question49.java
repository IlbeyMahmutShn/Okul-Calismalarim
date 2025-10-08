//1 kişinin vücud indeksini bulan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question49 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double lenght = 0 , kilo = 0 , endeks = 0;
        System.out.println("Lütfen boyunuzu giriniz");
        lenght = keyboard.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        kilo = keyboard.nextDouble();
        lenght = lenght / 100;
        endeks = kilo / lenght * lenght;

        System.out.println("Vücud indexiniz : " + endeks);
    }
}
