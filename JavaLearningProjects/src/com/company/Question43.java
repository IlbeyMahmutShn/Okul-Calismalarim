//Klavyeden girilen sayı kadar (N) sayısının faktoryelini alan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int factorial = 1;

        for (int index = number; index >=1; index--) {

            factorial *= index;
        }
        System.out.println(factorial);
    }
}
