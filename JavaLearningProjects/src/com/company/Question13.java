//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Question13 question = new Question13();

        while(true) {
            question.factorialFinder();
        }
    }

    public void factorialFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n = scanner.nextInt();
        int factorial = 1;

        for(int index = 1; index <= n; ++index) {
            factorial *= index;
        }

        System.out.println("Sayının faktöriyeli :" + factorial);
    }
}
