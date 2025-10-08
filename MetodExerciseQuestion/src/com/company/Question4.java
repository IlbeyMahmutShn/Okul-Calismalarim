//Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu olduğunu geri döndüren methodu yazınız.
package com.company;

public class Question4 {
    public static void main(String[] args) {
        int number = 321;
        int sonuc = step_finder(number);
        System.out.println(sonuc);
    }
    public static int step_finder(int a) {
        int numberHolder = 0;
        while (a > 0) {
            a /= 10;
            numberHolder++;
        }
        return numberHolder;
    }
}