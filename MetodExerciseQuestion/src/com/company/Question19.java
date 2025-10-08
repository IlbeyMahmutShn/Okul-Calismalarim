//Kendisine parametre olarak gelen tam sayı dizisinindeki en küçük elemanın indisini geri döndüren method yazınız.
package com.company;

public class Question19 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int sonuc = littleNumberFinder(A);
        System.out.println(sonuc);
    }
    public static int littleNumberFinder(int [] a) {
        int littleNumber = a[0];
        for (int index = 1; index < a.length; index++) {
            if (littleNumber > a[index]) {
                littleNumber = a[index];
            }
        }
        return littleNumber;
    }
}
