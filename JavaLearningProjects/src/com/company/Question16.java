//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        new Scanner(System.in);
        int numberHolder = 0;
        String bigletter = "Taner";

        for(int index = 0; index <= bigletter.length(); ++index) {
            if (bigletter.charAt(index) >= 'A' && bigletter.charAt(index) <= 'Z') {
                ++numberHolder;
            }
        }

        System.out.println("büyük harf sayısı :" + numberHolder);
    }
}
