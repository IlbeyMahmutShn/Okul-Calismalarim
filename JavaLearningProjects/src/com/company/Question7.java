//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.company;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir oparatör seçiniz (+,-,*,/)");
        String oparator = scanner.nextLine();
        System.out.println("Lütfen ilk sayıyı giriniz");
        int numberfirst = scanner.nextInt();
        System.out.println("Lütfen ikinci değeri giriniz");
        int numbersecond = scanner.nextInt();
        switch (oparator) {
            case "+" -> System.out.println("SONUÇ:" + (numberfirst + numbersecond));
            case "-" -> System.out.println("SONUÇ:" + (numberfirst - numbersecond));
            case "*" -> System.out.println("SONUÇ:" + numberfirst * numbersecond);
            case "/" -> System.out.println("SONUÇ:" + numberfirst / numbersecond);
            default -> System.out.println("Listede olmayan bir işlem seçtiniz");
        }

    }
}
