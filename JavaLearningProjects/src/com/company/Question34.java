package com.company;

import java.util.Scanner;

public class Question34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letterFinder = scanner.nextLine();
        int numberHolder = 0;

        for (int index = 0; index < letterFinder.length(); index++) {
            if (letterFinder.charAt(index) == 'A' || letterFinder.charAt(index) == 'a') {
                numberHolder++;
            }
        }
        System.out.println(numberHolder);
    }
}