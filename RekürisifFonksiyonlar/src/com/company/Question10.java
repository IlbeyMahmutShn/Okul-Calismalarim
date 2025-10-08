//Kendisine parametre olarak gelen dizide kaç tane pozitif sayı olduğunu bulan rekürsif fonksiyon.
package com.company;

public class Question10 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,-1};
        int numberHolder = 0;
        int sonuc = number_finder(A , 0 , numberHolder);
        System.out.println(sonuc);
    }
    public static int number_finder(int [] a , int n , int holder) {
        if (a.length == n) {
            return holder;
        }
        else if (a[n] > 0) {
            holder++;
        }
        return number_finder(a , n + 1 , holder);
    }
}
