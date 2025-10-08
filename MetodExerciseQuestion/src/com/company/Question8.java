//Kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren method yazınız.
package com.company;

public class Question8 {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 5;
        int sonuc = biggest_Finder(number , number2);
        System.out.println(sonuc);
    }
    public static int biggest_Finder(int a , int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
