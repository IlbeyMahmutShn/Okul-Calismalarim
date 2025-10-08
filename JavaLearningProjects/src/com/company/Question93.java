package com.company;

public class Question93 {
    public static void main(String[] args) {
        System.out.println(total(2 ,2));

    }
    public static int us(int n , int x) {
        int ustel = 1;
        while (n > 0) {
            ustel *= x;
            n--;
        }
        return ustel;
    }
    public static int factorial(int n) {
        int fak = 1;
        while (n > 0) {
            fak *= n;
            n--;
        }
        return fak;
    }
    public static int total(int x , int n) {
        int toplam = 0;
        while (n > 0) {
            toplam = toplam + (us(x , n)) / (factorial(n));
            n--;
        }
        return toplam;
    }
}
