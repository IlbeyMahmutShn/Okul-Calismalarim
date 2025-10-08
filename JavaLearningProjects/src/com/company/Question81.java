//Klavyeden girilen stringteki büyük harfleri bulup ekrana yazan java kodunu yazınız.
package com.company;

import  java.util.Scanner;

public class Question81 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberHolder = 0;
        String bigletter;
        bigletter = "Taner";
        for (int index = 0; index < bigletter.length(); index++) {

            if (bigletter.charAt(index) >= 'A' && bigletter.charAt(index) <= 'Z') {
                numberHolder++;
            }
        }
        System.out.println("büyük harf sayısı :" + numberHolder);
    }
}