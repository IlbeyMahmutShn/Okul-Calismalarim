package com.company;

public class Question23 {
    public static void main(String[] args) {
        int sonuc = total_1(10 , 0);
        System.out.println(sonuc);
    }
    public static int total_1(int n , int i) {
        if (n == 0) {
            return 0;
        }
        else {
            return (2 * i + 1) + total_1(n - 1 , i + 1);
        }
    }
}
