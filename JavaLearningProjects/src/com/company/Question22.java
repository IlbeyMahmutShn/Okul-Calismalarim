package com.company;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adsoyad[] = new String[5];
        int not[] = new int[5];

        for (int index = 0; index < 5; index++) {
            adsoyad[index] = keyboard.nextLine();
            not[index] = keyboard.nextInt();
            int max = not[0];
            String ogrenci = adsoyad[0];
            for (int jindex = 1; jindex < 5; jindex++) {
                if (max < not[index]) {
                    max = not[index];
                    ogrenci = adsoyad[index];
                }
            }
            System.out.println(max + " " + ogrenci);
        }
    }
}
