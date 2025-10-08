//Kendisine parametre olarak gelen tamsayı dizisinin her elemanını 1 arttırıp geri döndüren method yazınız.
package com.company;

public class Question21 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] sonuc = one_total(A);
        for (int index = 0; index < sonuc.length; index++) {
            System.out.println(sonuc[index]);
        }
    }
    public static int [] one_total(int [] a) {
        int [] total = new int[a.length];
        for (int index = 0; index < a.length; index++) {
            total[index] += (a[index] + 1);
        }
        return total;
    }
}
