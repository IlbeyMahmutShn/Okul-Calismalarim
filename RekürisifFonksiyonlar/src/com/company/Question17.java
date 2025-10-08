//Kendisine parametre olarak gelen n sayısına kadarki sayıların toplamını hesaplayan rekürsif fonksiyon.
package com.company;

public class Question17 {
    static int top = 0;
    public static void main(String[] args) {
        int sonuc = total(5);
        System.out.println(sonuc);
    }
    public static int total(int n) {
        if (n == 0) {
            return top;
        }
        else {
            top += n;
            return total(n - 1);
        }
    }
}
