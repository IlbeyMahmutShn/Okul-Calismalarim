//Kendisine parametre olarak gelen bir tam sayı dizisinde en büyük elemanın indisini hesaplayan rekürsif fonksiyon.
package com.company;

public class Question7 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9};
        int enb_number = A[0];
        int indis = 0;
        int sonuc = biggest_number_Finder(A , enb_number , indis , 0);
        System.out.println(sonuc);
    }
    public static int biggest_number_Finder(int [] a , int enb , int indis , int n) {
        if (a.length == n) {
            return indis;
        }
        else if (enb < a[n]) {
            enb = a[n];
            indis = n;
        }
        return biggest_number_Finder(a , enb , indis , n + 1);
    }
}
