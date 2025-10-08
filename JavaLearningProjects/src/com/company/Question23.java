package com.company;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int d[][] = new int[3][4];
        int max = 0;
        int satir = 0 , sutun = 0;


        for (int index = 0; index < 3; index++) {
            for (int jindex = 0; jindex < 4; jindex++) {
                System.out.println("Lütfen bir sayı giriniz");
                d[index][jindex] = keyboard.nextInt();
                max = d[0][0];

                if (max < d[index][jindex]) {
                    max = d[index][jindex];
                    satir = index;
                    sutun = jindex;
                }
            }
        }
        System.out.println("En büyük sayı : " + max + "bulunduğu satır : " + satir + "bulunduğu sütun : " + sutun);
    }
}