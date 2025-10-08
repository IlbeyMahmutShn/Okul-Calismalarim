//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Question12 question = new Question12();

        while(true) {
            question.singleAverage();
        }
    }

    public void singleAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int singleNumber = scanner.nextInt();
        int total = 0;
        int numberHolder = 1;
        if (singleNumber % 2 == 1) {
            total += singleNumber;
            ++numberHolder;
        }

        System.out.println("Tek sayıların toplamlarının ortalaması :" + total / numberHolder);
    }
}
