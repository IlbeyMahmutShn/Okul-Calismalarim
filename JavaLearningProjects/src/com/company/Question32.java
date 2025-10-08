package com.company;

import java.util.Scanner;

public class Question32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigNumber1 , bigNumber2 , number1 , number2;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        if (number1 > number2){
            bigNumber1 = number1;
            bigNumber2 = number2;
        }
        else {
            bigNumber1 = number2;
            bigNumber2 = number1;
        }
        for (int index = 2; index < 10; index++) {
            number1 = scanner.nextInt();
            if (number1 > bigNumber1){
                bigNumber2 = bigNumber1;
                bigNumber1 = number1;
            }
            else if (number1 > bigNumber2) {
                bigNumber2 = number1;
            }
        }
        System.out.println(bigNumber2);

    }
}
