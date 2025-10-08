package com.company;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner keyboarad = new Scanner(System.in);
        String d[][] = new String[2][2];
        int satir = 0, sutun = 0;


        for (int index = 0; index < 2; index++) {
            for (int jindex = 0; jindex < 2; jindex++) {
                System.out.println("Lütfen bir kelime giriniz");
                d[index][jindex] = keyboarad.nextLine();
                for (int kindex = 0; kindex < d[index][jindex].length(); kindex++) {

                    if (d[index][jindex].charAt(kindex) == 'e') {
                        System.out.println("İçinde e harfi olan kelime : " + d[index][jindex]);
                        satir = index;
                        sutun = jindex;
                        System.out.println("ve kelimenin satırı : " + satir + "sütunu : " + sutun);
                        break;
                    }
                }
            }
        }
    }
}