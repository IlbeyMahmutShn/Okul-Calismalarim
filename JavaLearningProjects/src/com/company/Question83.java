package com.company;

public class Question83 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] B = new int[1];
        int [] sonuc = total(A , B , 0);
        System.out.println(sonuc[0]);
    }
    public static int [] total(int [] a , int [] b , int n) {
        b [0] += a [n];
        if (a.length-1 == n) {
            return b;
        }
        else {
            return total(a , b , n + 1);
        }
    }
}
