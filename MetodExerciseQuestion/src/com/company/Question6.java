//Kendisine parametre olarak gelen pozitif tam sayının faktöryelini geri döndüren method yazınız.
package com.company;

public class Question6 {
    public static void main(String[] args) {
        int number = 5;
        int sonuc = factorial(number);
        System.out.println(sonuc);
    }
    public static int factorial(int n) {
        int fak = 1;
        for (int index = 1; index <= n; index++) {
            fak *= index;
        }
        return fak;
    }
}
