//Kendisine parametre olarak gelen a ve b sayısının a üssü b sini hesaplayan rekürsif fonksiyon.
package com.company;

public class Question4 {
    public static void main(String[] args) {
        int sonuc = exponential_Numbers(2 , 5);
        System.out.println(sonuc);
    }
    public static int exponential_Numbers(int a , int b) {
        if (b == 0) {
            return 1;
        }
        else {
            return a * exponential_Numbers(a , b - 1);
        }
    }
}
