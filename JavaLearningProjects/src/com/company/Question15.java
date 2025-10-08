//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA;
        int numberB;
        do {
            System.out.println("Lütfen a değerini giriniz");
            numberA = scanner.nextInt();
            System.out.println("Lütfen b değerini giriniz");
            numberB = scanner.nextInt();
        } while(numberA != 0);

        System.out.println("A üssü b : " + Math.pow((double)numberA, (double)numberB));
    }
}
