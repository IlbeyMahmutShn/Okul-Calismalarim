//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double biggestNumber = scanner.nextDouble();
        int numberHolder = 1;
        double temp = (double)0.0F;

        for(int index = 1; index < 10; ++index) {
            System.out.println("Lütfen bir sayı daha giriniz");
            temp = scanner.nextDouble();
            if (temp > biggestNumber) {
                biggestNumber = temp;
                ++numberHolder;
            }
        }

        System.out.println("En büyük sayı : " + biggestNumber + " En büyük saıyının sırası :" + numberHolder);
    }
}
