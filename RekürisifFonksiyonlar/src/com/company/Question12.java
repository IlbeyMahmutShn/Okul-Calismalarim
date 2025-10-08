//Kendisine parametre olarak gelen diziyi ters çeviren rekürsif fonksiyon.
package com.company;

public class Question12 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] sonuc = ters_array(A , 0);
        for (int index = 0; index < sonuc.length; index++) {
            System.out.println(sonuc[index]);
        }
    }
    public static int temp = 0;
    public static int [] ters_array(int [] a , int n) {
        if (a.length / 2 == n) {
            return a;
        }
        else {
            temp = a [a.length - 1 - n];
            a[a.length - 1 - n] = a [n];
            a [n] = temp;
        }
        return ters_array(a , n + 1);
    }
}
