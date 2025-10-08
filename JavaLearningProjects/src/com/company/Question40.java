package com.company;
import java.util.*;

public class Question40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number [] = new int[5];
        int us = 1;
        int fak = 1;
        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
            int n = number [i];

            while (n > 0) {
                us *= 2;
                n--;
            }
            while(n > 0) {
                fak *= n;
                n--;
            }

        }
    }
}
