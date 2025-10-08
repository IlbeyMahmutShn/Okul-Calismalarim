//Klavyeden girilen a ve b sayısını a üssü b şeklinde hesaplayan java kodunu yaznız.
package com.company;

import java.util.Scanner;

public class Question99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen a sayısını giriniz");
        double a = scanner.nextDouble();
        System.out.println("Lütfen b değerini giriniz");
        double b = scanner.nextDouble();
        System.out.println("Sonuç :" + (Math.pow(a,b)));
    }
}