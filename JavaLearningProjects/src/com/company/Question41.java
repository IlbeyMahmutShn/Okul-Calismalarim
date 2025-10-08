package com.company;
import java.util.*;

public class Question41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean asal = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0);
                    asal = false;
                    System.out.println(i);
                }
            }
        }

    }
}
