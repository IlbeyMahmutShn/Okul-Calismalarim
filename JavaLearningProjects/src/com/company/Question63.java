package com.company;
import java.util.Scanner;

public class Question63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sonuc = total(scanner);
        System.out.println(sonuc);
    }
    public static int total(Scanner x) {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += x.nextInt();
        }
        return total;
    }
}
