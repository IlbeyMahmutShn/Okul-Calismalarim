//Kendisine parametre olarak gelen 2 tam sayının toplamını geri döndüren method yazınınz.
package com.company;

public class Question {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int sonuc = total(x , y);
        System.out.println(sonuc);

    }
    public static int total(int a , int b) {
        int total = 0;
        total = a + b;
        return total;
    }
}