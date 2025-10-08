package com.company;
import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int number = scanner.nextInt();
            switch (number) {
                case 10:
                    System.out.println("Sayı 10");
                    break;
                case 20:
                    System.out.println("Sayı 20");
                    break;
                case 30:
                    System.out.println("Sayı 30");
                    break;
                case 40:
                    System.out.println("Sayı 40");
                    break;
                case 50:
                    System.out.println("Sayı 50");
                    break;
                default:
                    System.out.println("Sayı 10 ve 10 'un katı değildir");
            }
        }
    }
}
