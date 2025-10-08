//Kendisisne parametre olarak gelen 5 sayılı dizesindeki en büyük ve en küçük elemanı geri döndüren kodu ve metodu yazınız.
package com.company;

public class Question127 {
    public static void main(String[] args) {
        int[] d = {1,5,7,3,2,8};
        int[] d2;
        d2 = ebekbul(d);
        System.out.println(d2[0] + " " + d2[1]);

    }

    public static int[] ebekbul(int [] a) {
        int enb , enk;
        enb = a[0];
        enk = a[0];
        for (int index = 1; index < a.length; index++) {
            if (a [index] > enb) {
                enb = a[index];
            }
            if (a[index] < enk) {
                enk = a[index];
            }
        }
        int [] d3 = new int[2];
        d3[0] = enk;
        d3[1] = enb;
        return d3;
    }
}
