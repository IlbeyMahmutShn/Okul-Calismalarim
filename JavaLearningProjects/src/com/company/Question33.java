package com.company;

import java.util.Scanner;

public class Question33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String littelConverter , bigConverter = "";
        littelConverter = "Taner";
        for (int index = 0; index < littelConverter.length(); index++) {
            if (littelConverter.charAt(index) >= 'A' && littelConverter.charAt(index) <= 'Z' ) {
                bigConverter = bigConverter + (char)(littelConverter.charAt(index) + 32);
            }
            else if (littelConverter.charAt(index) >= 'a' && littelConverter.charAt(index) <= 'z') {
                bigConverter = bigConverter + (char)(littelConverter.charAt(index) - 32);
            }
            else {
                bigConverter = bigConverter + littelConverter.charAt(index);
            }
        }
        System.out.println(bigConverter);
    }
}
