//Klavyenden girilen Fahrenayt derecesini Cantigrad'a çeviren java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen Fahrenayt derecesini giriniz");
        int number = keyboard.nextInt();

        System.out.println("Cantigrad derecesi : " + (number * 5 / 9 - 32));


    }
}
