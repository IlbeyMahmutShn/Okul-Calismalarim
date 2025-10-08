package com.company;

import java.util.Scanner;

public class Questionteyzem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen yaş giriniz");
        int enb = keyboard.nextInt();
        int number = 0;
        int counter = 1;


        for (int index = 0; index < 4; index++) {
            System.out.println("Lütfen yaş giriniz");
            number = keyboard.nextInt();
        }
        for (int jindex = 0; jindex < 5; jindex++) {
            if (enb > number) {
                enb = number;
                counter++;
            }
        }
        System.out.println(number + " " + counter);
    }
}
