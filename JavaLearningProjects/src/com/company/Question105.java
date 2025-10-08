//Klavyeden girilen 3 tane tam sayıyı büyükten küçüğe sıralayan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question105 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int biggestNumber , littleNumber , ortnumber;
        System.out.println("Lütfen bir sayı giriniz");
        int number = keyboard.nextInt();
        biggestNumber = number;
        ortnumber = number;
        littleNumber = number;

        for (int index = 0; index < 2; index++) {
            System.out.println("Lütfen bir sayı giriniz");
            number = keyboard.nextInt();

            if (number > biggestNumber) {
                ortnumber = biggestNumber;
                biggestNumber = number;
            }
            else if (number < littleNumber) {
                ortnumber = littleNumber;
                littleNumber = number;
            }
        }
        System.out.println(biggestNumber + " > " + ortnumber + " > " + littleNumber);
    }
}