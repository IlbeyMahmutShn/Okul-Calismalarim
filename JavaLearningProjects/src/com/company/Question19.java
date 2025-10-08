//Klavyeden 5 tane String giriliyor bu stringleri tutan diziyi yazınız
package com.company;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String d[] = new String[5];
        for (int index = 0; index < 5; index++) {
            d[index] = keyboard.nextLine();

        }
    }
}
