//Kavyeden 15 tane sayı alınacak bu sayıların ilk önce tek olanlarını ekrana yazdırılacak sonra çift olanlarını ekranan yazdıracaz.
// Klavyeden girilen 5 tane sayının karesini hesaplayıp karelerinin yeni bir dizeye atamasının yapılması karelerinin ekranan yazdırılması
package com.company;

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int d[] = new int[15];
        int d1[] = new int[15];
        int d2[] = new int[15];

        for (int index = 0; index < 15; index++) {
            d[index] = keyboard.nextInt();

        }
        for (int jindex = 0; jindex < 15; jindex++) {

            if (d[jindex] % 2 == 1) {
                d1[jindex] += d[jindex];

            }
            if (d[jindex] % 2 == 0) {
                d2[jindex] += d[jindex];


            }
            System.out.println(d1[jindex]);
            System.out.println(d2[jindex]);
        }
    }
}
