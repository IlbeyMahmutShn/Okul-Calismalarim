//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Question14 question = new Question14();

        while(true) {
            question.arrangementFinder();
        }
    }

    public void arrangementFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütefen bir a değeri giriniz");
        int a = scanner.nextInt();
        System.out.println("Lütfen b değerini giriniz");
        int b = scanner.nextInt();
        System.out.println("Lütfen c değerini giiriniz");
        int c = scanner.nextInt();
        if (a > b && b > c) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + a + " > " + b + " > " + c);
        } else if (a > c && c > b) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + a + " > " + c + " > " + b);
        } else if (b > a && a > c) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + b + " > " + a + " > " + c);
        } else if (b > c && c > a) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + b + " > " + c + " > " + a);
        } else if (c > a && a > b) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + c + " > " + a + " > " + b);
        } else if (c > b && b > a) {
            System.out.println("Büyükten küçüğe doğru sıralanışı :" + c + " > " + b + " > " + a);
        }

    }
}
