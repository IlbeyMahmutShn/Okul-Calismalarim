package com.company;

class Question70 {
    int[] dizi;

    Question70(int n) {
        dizi = new int[n];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
    }
    void diziyaz() {
        for (int x : dizi) {
            System.out.println(x + " ");
        }
    }

    int [] enbenk() {
        int [] enbenk = {dizi[0] , dizi[0]};

        for (int i = 0; i < dizi.length; i++) {
            if (enbenk[0] < dizi[i]) {
                enbenk [0] = dizi[i];
            }
            else if (enbenk [1] > dizi[i]) {
                enbenk[1] = dizi[i];
            }
        }
        return enbenk;
    }
}
class test {
    public static void main(String[] args) {
        Question70 dizi = new Question70(6);
        dizi.diziyaz();
        int [] sonuc = dizi.enbenk();
        System.out.println("En büyük ve en küçükler : " + sonuc[0] + " " + sonuc[1]);
    }
}
