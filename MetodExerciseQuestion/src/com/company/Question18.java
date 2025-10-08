//Kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren method yazınız.
package com.company;

public class Question18 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int sonuc = array_total(A);
        System.out.println(sonuc);
    }
    public static int array_total(int [] a) {
        int total = 0;
        for (int index = 0; index < a.length; index++) {
            total += a[index];
        }
        return total;
    }
}
