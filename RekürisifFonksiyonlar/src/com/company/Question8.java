//Kendisine parametre olarak gelen dizinin sıralı olup olmadığını kontrol eden rekürsif fonksiyon.
package com.company;

public class Question8 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        boolean sonuc = in_line(A , 0);
        System.out.println(sonuc);
    }
    public static boolean in_line(int [] a , int n) {
        if (a.length-1 == n) {
            return false;
        }
        else if (a [n] > a [n+1]) {
            return false;
        }
        else {
            return in_line(a , n + 1);
        }
    }
}
