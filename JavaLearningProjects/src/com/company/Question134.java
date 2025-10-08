//Kendisine parametre olarak gelen 2 tane değerden en küçük ve efn büyük değeri geri döndüren methodu yazınınz.
package com.company;

public class Question134 {
    public static void main(String[] args) {
        int [] dizi = {3 , 8 ,7 , 1 , 6 , 4 , 2};
        int [] x = new int[2];
        x = enb_enk_bul(dizi);
        System.out.println(x[0] + " " + x[1]);

    }
    public static int [] enb_enk_bul(int [] a) {
        int enb , enk;
        enb = a[0];
        enk = a[0];

        for (int index = 0; index < a.length; index++) {
            if (enb < a[index]) {
                enb = a[index];
            }
            if (enk > a[index]) {
                enk = a[index];
            }
        }
        int []d = new int[2];
        d[0] = enb;
        d[1] = enk;
        return d;
    }
}
