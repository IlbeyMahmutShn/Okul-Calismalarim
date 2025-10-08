//Klavyden girilen saıyın faktöriyelini hesaplayan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question104 {
    public static void main(String[] args) {
        Question104 question = new Question104();
        for (;; )
            question.factorialFinder();
    }

    public void factorialFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int index = 1; index <= n; index++) {
            factorial = factorial * index;

        }
        System.out.println("Sayının faktöriyeli :" + factorial);
    }
}