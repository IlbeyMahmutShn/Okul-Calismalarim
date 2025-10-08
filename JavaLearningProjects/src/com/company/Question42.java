//Beş sayının toplamını ve ortalamasını veren java kodunu yazınız.
package com.company;

public class Question42 {
    public static void main(String[] args) {
        int number = 1 , number2 = 2 , number3 = 3 , number4 = 4 , number5 = 5;
        int total = 0 , average = 0;
        total += number + number2 + number3 + number4 + number5;
        System.out.println("Sayıların topalamı : " + total + " Sayıların ortalaması : " + total / 5);
    }
}
