package com.company;

public class Question96 {
    public static void main(String[] args) {
        diziIslem d = new diziIslem(6);
        d.diziYaz();
        int [] sonuc = d.enbenk();
        System.out.println("en büyük ve en küçükler : " + sonuc[0] + " " + sonuc[1]);
    }
}
class diziIslem {
    int [] dizi;
    diziIslem(int n) {
        dizi = new int[n];
        for (int index = 0; index < dizi.length; index++) {
            dizi [index] = (int) (Math.random()*100);
        }
    }
    void diziYaz() {
        for (int x: dizi) {
            System.out.println(x + " ");
        }
    }
    int [] enbenk() {
        int [] enbenk = {dizi[0] , dizi[0]};
        for (int i = 1; i < dizi.length; i++) {
            if (enbenk [0] < dizi[i]) {
                enbenk [0] = dizi[i];
            }
            if (enbenk [1] > dizi[i]) {
                enbenk [1] = dizi[i];
            }
        }
        return enbenk;
    }
}
