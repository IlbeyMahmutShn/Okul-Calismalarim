package com.company;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Question1 question = new Question1();

        while(true) {
            question.biggestNumberFinder();
        }
    }

    public void biggestNumberFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen klavyeden bir sayı giriniz");
        int biggestNumber = scanner.nextInt();
        int temp = 0;

        for(int index = 1; index < 5; ++index) {
            System.out.println("Lütfen klavyeden bir sayı giriniz");
            temp = scanner.nextInt();
            if (temp > biggestNumber) {
                biggestNumber = temp;
            }
        }

        System.out.println("En büyük sayı : " + biggestNumber);
    }
}
