//Klavyeden 10 tane sayı giriliyor en büğünü ve kaçıncı olduğunu bulan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        double biggestNumber = scanner.nextDouble();
        int numberHolder = 1;
        double temp = 0;


        for (int index =1; index < 10; index++) {
            System.out.println("Lütfen bir sayı daha giriniz");
            temp = scanner.nextDouble();


            if (temp > biggestNumber) {
                biggestNumber = temp;
                numberHolder++;
            }
        }
        System.out.println("En büyük sayı :" + " " + biggestNumber + " " + "En büyük saıyının sırası :" + numberHolder);
    }
}