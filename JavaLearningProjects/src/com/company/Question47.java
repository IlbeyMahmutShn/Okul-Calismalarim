//Klavyeden girilen 10 tane double sayının ortalamasını yazdıran java kodunu yazınınz.
package com.company;

import java.util.Scanner;

public class Question47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0 , numberHolder = 0 , average = 0;
        double d[] = new double[10];

        for (int index = 0; index < 10; index++) {
            System.out.println("Lütfen dizi değeri giriniz");
            d[index] = scanner.nextDouble();
            total += d[index];
            numberHolder++;
        }
        average = total / numberHolder;
        System.out.println(average);
    }
}
