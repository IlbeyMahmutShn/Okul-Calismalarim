//Klavyeden girilen 3 tam sayıyı sıralyan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int number1 = scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int number2 = scanner.nextInt();

        if (number > number1 && number1 > number2){
            System.out.println(number + ">" + number1 + ">" + number2);
        }
        else if (number > number2 && number2 > number1){
            System.out.println(number + ">" + number2 + ">" + number1);
        }
        else if (number1 > number && number > number2){
            System.out.println(number1 + ">" + number + ">" + number2);
        }
        else if (number1 > number2 && number2 > number){
            System.out.println(number1 + ">" + number2 + ">" + number);
        }
        else if (number2 > number1 && number1 > number){
            System.out.println(number2 + ">" + number1 + ">" + number);
        }
        else if (number2 > number && number > number1){
            System.out.println(number2 + ">" + number + ">" + number1);
        }
    }
}
