//Kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki tek olanların ortalamasını bulan kodu ve metodu yazınız
package com.company;

public class Question130 {
    public static void main(String[] args) {
        double[] d = {1,5,3,4,67,};
        System.out.println(ortbul(d));
    }

    public static double ortbul(double [] a) {
        double total = 0;
        double numberHolder = 0;
        for (int index = 0; index < a.length; index++) {
            if (a [index] % 2 == 1) {
                total += a[index];
                numberHolder++;
            }
        }
        if (numberHolder == 0) {
            return 0.0;
        }
        else {
            return total / numberHolder;
        }
    }
}