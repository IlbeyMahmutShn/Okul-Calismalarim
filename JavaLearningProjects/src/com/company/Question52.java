//Verilen tamsayının sıfır, pozitif yada negatif olup olmadığını bulan java kodunu yazınız.
package com.company;

public class Question52 {
    public static void main(String[] args) {
        int number = 0;

        if (number == 0) {
            System.out.println("Sayı sıfırdır");
        }

        if (number > 0) {
            System.out.println("Sayı pozitifdir");
        }

        if (number < 0) {
            System.out.println("Sayı negatifdir");
        }
    }
}
