//Klavyeden girilen tek sayıların ortalamasını ekrana yazan java kodunu yazoınız.
package com.company;

import java.util.Scanner;

public class  Question103 {
    public static void main(String[] args) {
        Question103 question = new Question103();
        for (;;)
            question.singleAverage();
    }

    public void singleAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int singleNumber = scanner.nextInt();
        int total = 0;//Sor?
        int numberHolder = 0;

        if (singleNumber % 2 == 1) {
            total = total + singleNumber;
            numberHolder++;
        }
        System.out.println("Tek sayıların toplamlarının ortalaması :" + total / numberHolder);
    }
}