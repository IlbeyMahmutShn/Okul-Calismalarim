//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("N sayısını giriniz");
        int n = scanner.nextInt();
        System.out.print(n1 + " " + n2);

        for(int i = 2; i < n; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
