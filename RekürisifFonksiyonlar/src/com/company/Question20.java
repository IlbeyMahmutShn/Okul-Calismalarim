//dizinin sıralı olup olmadığını kontrol eden rekürsif fonksiyon.
package com.company;

public class Question20 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        boolean sonuc = in_line(A , 0);
        System.out.println(sonuc);
    }
    public static boolean in_line(int [] a , int n) {
        if (a.length-1 == n) {
            return true;
        }
        else if (a[n] > a[n + 1]) {
            return false;
        }
        return in_line(a , n + 1);
    }
}
