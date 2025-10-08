//Kendisine parametre olarak gelen dizi sıralımıdır.
package com.company;

public class Question135 {
    public static void main(String[] args) {
        int []dizi = {1 , 2 , 3 , 4 , 5};
        boolean t = siralimi(dizi);
        if (t) {
            System.out.println("Sıralı");
        }
        else {
            System.out.println("Sırasız");
        }
    }
    public static boolean siralimi(int [] a) {
        boolean p = true;
        for (int index = 1; index < a.length; index++) {
            if (a[index] < a[index + 1]) {
                p = false;
                return p;
            }
        }
        return p;
    }
}
