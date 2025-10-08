//Klavyeden girilen string 5 ve 5 den büyük olmadığı sürece yazdıracaksın
package com.company;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberHolder = 0;

        while (numberHolder != 5) {
            System.out.println("Lütfen bir kelime giriniz");
            String word = keyboard.nextLine();

            if (word.length() >= 5) {
                numberHolder++;
                System.out.println(numberHolder + "Kelime:" +word);
            }
        }
    }
}
