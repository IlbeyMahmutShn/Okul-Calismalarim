//Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı geri döndüren method yazınız.
package com.company;

public class Question23 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int sonuc = second_biggest_number_Finder(A);
        System.out.println(sonuc);
    }
    public static int second_biggest_number_Finder(int [] a) {
        int enb = a[0];
        int enb2 = a[0];
        for (int index = 1; index < a.length; index++) {
            if (enb < a[index]) {
                enb2 = enb;
                enb = a[index];
            }
            else if (enb2 < a[index]) {
                enb2 = a[index];
            }
        }
        return enb2;
    }
}
