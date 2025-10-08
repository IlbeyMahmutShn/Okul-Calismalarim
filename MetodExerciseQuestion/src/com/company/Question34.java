//Kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki tek olanların ortalamasını geri döndüren method.
package com.company;

public class Question34 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9,10};
        int sonuc = single_average_total(A);
        System.out.println(sonuc);
    }
    public static int single_average_total(int [] a) {
        int total = 0;
        int numberHolder = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index] % 2 == 1) {
                total += a[index];
                numberHolder++;
            }
        }
        return total / numberHolder;
    }
}
