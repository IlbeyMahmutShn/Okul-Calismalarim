//3 basamaklı sayılar içerisinden 2 ve 3 ile bölünebilen sayıları ekrana yazan java kodunu do / while ile yazınız.
package com.company;

public class Question108 {
    public static void main(String[] args) {
        int index = 100;

        do {
            if (index % 2 == 0 && index % 3 == 0) {
                System.out.println("3 basamaklı 2 ve 3'e bölünebilen sayılar :" + " " + index);
            }
            index++;
        }while (index < 1000);
    }
}