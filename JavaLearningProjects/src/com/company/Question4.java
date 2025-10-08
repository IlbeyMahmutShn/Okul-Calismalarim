//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen a sayısını giriniz");
        double a = scanner.nextDouble();
        System.out.println("Lütfen b değerini giriniz");
        double b = scanner.nextDouble();
        PrintStream var10000 = System.out;
        double var10001 = Math.pow(a, b);
        var10000.println("Sonuç :" + var10001);
    }
}
