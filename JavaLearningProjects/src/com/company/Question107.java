//Klavyeden girilen 3 basamaklı sayılar içerisinden 2 ve 3 ile bölünebilen sayıları ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question107 {
    public static void main(String[] args) {
        Question107 question = new Question107();
        for(;;)
            question.finderDivisor();
    }
    public void finderDivisor() {
        for (int index = 100; index < 1000; index++) {
            if (index % 2 == 0) {
                System.out.println(index + ": 2'ye tam bölünmketedir");
            }

            if (index % 3 == 0) {
                System.out.println(index + ": 3'e tam bölünmketedir");
            }
        }
    }
}