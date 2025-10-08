//Kendisine parametre olarak gelen 2 tam sayı dizisindeki i ninci indisteki değerler farklı ise tek dizi oluşturup geri döndüren method.
package com.company;

public class Question16 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] B = {1,4,7,8,5};
        int numberHolder = 0;
        for (int jindex = 0; jindex < A.length; jindex++) {
            if (A[jindex] != B[jindex]) {
                numberHolder++;
            }
        }
        int [] sonuc = bul(A , B , numberHolder);
        for (int index = 0; index < sonuc.length; index++) {
                System.out.println(sonuc[index]);
        }
    }
    public static int [] bul(int [] a , int [] b , int sayac) {
        int [] c = new int[sayac*2];
        int n = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index] != b[index]) {
                c[n] = a[index];
                c[n + sayac] = b[index];
                n++;
            }
        }
        return c;
    }
}