//en büyük bulma
package com.company;

public class Question84 {
    public static void main(String[] args) {
        int [] A = {1,2,20,4,5,10};
        int B ;
        B = A[0];
        int sonuc = total(A , B , 0);
        System.out.println(sonuc);
    }
    public static int total(int [] a , int b , int n) {
        if (a.length == n) {
            return b;
        }
        else if (b < a[n]) {
            b = a[n];
        }
        return total(a , b , n + 1);
    }
}
