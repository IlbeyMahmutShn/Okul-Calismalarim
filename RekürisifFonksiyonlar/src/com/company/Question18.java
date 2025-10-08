//Kendisine parametre olarak gelen n sayısına kadarki sayıların toplamını hesaplayan rekürsif fonksiyon.
package com.company;

public class Question18 {
    public static void main(String[] args) {
        int top = 0;
        int sonuc = total(5 , top);
        System.out.println(sonuc);
    }
    public static int total(int n , int top) {
        if (n == 0) {
            return top;
        }
        else {
            top += n;
            return total(n -1 , top);
        }
    }
}