//klavyeden girilen strigleri ekrana yazan java kodunu yazınız.

package com.company;

import java.util.Scanner;

public class Question110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz giriniz");
        String word = scanner.nextLine();
        System.out.println(word);
    }
}