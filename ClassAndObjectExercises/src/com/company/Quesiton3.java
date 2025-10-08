//Hesapla
package com.company;

public class Quesiton3 {
    public static void main(String[] args) {
        double sonuc = 0;
        hesapla h = new hesapla();
        sonuc = h.hesapla(6);
        h.hesapla(10, 5);
        System.out.println(sonuc);

    }
}

    class hesapla {
        public int n;
        public int en;
        public int boy;
        public double total;

        public void hesapla() {
            this.n = 5;

            for (int index = 0; index < n; index++) {
                 n *= index;
            }
            System.out.println(n);
        }
        public void hesapla(int a , int b) {
            this.en = a;
            this.boy = b;
            System.out.println(a*b);
        }
        public double hesapla(int n) {
            for (int index = 1; index < n; index++) {
                total += ( n * n )- 4;
            }
            return total;
        }
    }
