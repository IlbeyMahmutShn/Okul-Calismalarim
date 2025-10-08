// Klavyeden girilen 5 adet kelimenin en uzununu ekrana yazdırın yerini bildiriniz
package com.company;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String d[] = new String [5];
        int konum = 0;

        for (int index = 0; index < 5; index++) {
            System.out.println("Lütfen bir kelime giriniz");
            d[index] = keyboard.nextLine();

            if (d[index].length() > d[konum].length()) {
                konum = index;
            }
        }
        System.out.println("En uzun kelime : " + d[konum]);
        System.out.println("En uzun kelimenin konumu : " + (konum + 1));
    }
}
