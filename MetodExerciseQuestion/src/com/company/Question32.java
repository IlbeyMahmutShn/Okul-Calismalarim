//10 Elemanlı 2 tam sayı dizisini toplsamını geri döndüren method.
package com.company;

public class Question32 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] B = {6,7,8,9,10};
        int sonuc = total(A , B);
            System.out.println(sonuc);
    }
    public static int total(int [] a , int [] b) {
        int total = 0;
        for (int index = 0; index < a.length; index++) {
            total += a[index] + b[index];
        }
        return total;
    }
}
