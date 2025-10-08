//Kendisine parametre olarak gelen tam sayı dizisindeki en büyük ve en küçük tam sayıyı geri döndüren method yazınız.
package com.company;

public class Question24 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] sonuc = little_biggest_number_Finder(A);
        for (int index = 0; index < sonuc.length; index++) {
            System.out.println(sonuc[index]);
        }
    }
    public static int [] little_biggest_number_Finder(int [] a) {
        int enb = a[0];
        int enk = a[0];
        for (int index = 1; index < a.length; index++) {
            if (enb < a[index]) {
                enb = a[index];
            }
            if (enk > a[index]) {
                enk = a[index];
            }
        }
        int [] dizi = new int[2];
        dizi[0] = enb;
        dizi[1] = enk;
        return dizi;
    }
}
