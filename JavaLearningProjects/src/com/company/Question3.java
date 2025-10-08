//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        double total = (double)0.0F;
        int counter = 0;

        while(true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number % 2 == 1) {
                total += (double)number;
                ++counter;
                System.out.println("girdiğin sayıların ortalaması : " + total / (double)counter);
            }
        }
    }
}
