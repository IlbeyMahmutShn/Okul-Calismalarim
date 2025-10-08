//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        (new Question5()).calculator();
    }

    public void calculator() {
        System.out.println("Lütfen bir operatör giriniz(+,-,/,*)");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        System.out.println("İlk sayıyı giriniz");
        int firstNumber = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int secondNumber = scanner.nextInt();
        switch (operator) {
            case "+" -> System.out.println("SONUC : " + (firstNumber + secondNumber));
            case "-" -> System.out.println("SONUC : " + (firstNumber - secondNumber));
            case "/" -> System.out.println("SONUC : " + firstNumber / secondNumber);
            case "*" -> System.out.println("SONUC : " + firstNumber * secondNumber);
            default -> System.out.println("Hatalı bir karakter girişi yaptınız");
        }

    }
}
