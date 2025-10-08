package com.company;
import java.util.Scanner;

public class Question68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = (int)(100.0 * Math.random());
        int number = 0;
        int sayac = 0;

        for (;;) {

            number = scanner.nextInt();
            sayac++;
            if (number == sayi) {
                System.out.println("Bildiniz");
                System.out.println(sayac + " denemede buldunuz");
                break;
            }
            if (number < sayi) {
                System.out.println("Girilen sayıdan büyük");
            }
            else {
                System.out.println("Girilen sayıdan küçük");
            }
        }
    }
}
