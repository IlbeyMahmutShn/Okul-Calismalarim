package com.company;

public class Question92 {
    public static void main(String[] args) {
        int A = 10 , B = 20;
        prime_finder(A , B);
        System.out.println(prime_finder(A , B));
    }
    public static boolean prime_finder(int a , int b) {
        int numberHolder = 0;
        int kucuk;
        if (a > b) {
            kucuk = b;
        }
        else {
            kucuk = a;
        }
        for (int index = 2; index < kucuk; index++) {
            if (a % index == 0 && b % index == 0) {
                numberHolder++;
            }
        }
        if (numberHolder == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
