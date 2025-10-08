//klavyeden iki adet sayı girişi yapılmaktadır bu sayıların aralığındaki asal sayıları bulan ve bir dizeye yükleyen programı yazınız.
package com.company;

import java.util.Scanner;

public class Question59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Lütfen bir sayı giriniz");
        int aNumber = scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int bNumber = scanner.nextInt();
        int [] dizi = new int[bNumber - aNumber];
        for (int index = aNumber; index < bNumber; index ++) {

            for (int jindex = 2; jindex < index; jindex++) {

                if (index % jindex != 0 ) {
                    dizi [counter] = index;
                    counter++;
                }
            }
        }
        for (int kindex = 0; kindex <= dizi.length; kindex++) {
            System.out.println(dizi[kindex]);
        }
    }
}
