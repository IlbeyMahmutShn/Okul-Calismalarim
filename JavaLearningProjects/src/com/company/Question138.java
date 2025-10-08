////Klavyevden 20 adet sayı giriliyor girilen sayıları 20 eleman kapasiteli bir dizi ye koyuluyopr bu dizideki çift elemanları yazdıran programı yazoınız
package com.company;

import java.util.Scanner;

public class Question138 {
    public static void main(String[] args) {
        int []A = new int[20];
        int [] prime = single_finder(A);
        for (int kindex = 0; kindex <= prime.length; kindex++) {
            if (prime[kindex] % 2 == 0) {
                System.out.println(prime[kindex]);
            }
        }
    }

    public static int [] single_finder(int []a) {
        Scanner keyboard = new Scanner(System.in);
        for (int index = 0; index < 20; index++) {
            System.out.println("Lütfen bir sayı giriniz");
            a[index] = keyboard.nextInt();
        }
        return a;
    }
}
