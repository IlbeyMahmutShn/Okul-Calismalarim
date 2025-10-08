//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.company;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int numberHolder = 0;
        String word = "";

        for(int index = 0; index < 3; ++index) {
            System.out.println("Lütfen bir cümle veya kelime giriniz");
            numberHolder = 0;
            word = scanner.nextLine();

            for(int jindex = 0; jindex < word.length(); ++jindex) {
                ++numberHolder;
            }
        }

        for(int a = 0; a < 3; ++a) {
            System.out.println("Lütfen bir sayı giriniz");
            number = scanner.nextInt();
        }

        if (number == numberHolder) {
            System.out.println("Uyuşan kelime : " + word);
        } else {
            System.out.println("Uyuşan kelime bulunamadı");
        }

    }
}
