//50 İLE 100 ARASINDAKİ ASAL SAYILARUI BULUPĞ BİR DİZİYE KOYUP O DİZİYİ GERİYE DÖNDÜREWCEK O DİZİYİ EKRANA YAZDIRACAK METHODU YAZINIZ.
package com.company;

public class Question136 {
    public static void main(String[] args) {
        int []A = new int[10];
        int [] prime = prime_finder(A);
        for (int kindex = 0; kindex <= prime.length ; kindex++) {
            System.out.println(prime[kindex]);
        }
    }
    public static int [] prime_finder(int []a) {
        int k = 0;
        boolean isprime = true;
        for (int index = 51; index < 100; index++) {
            isprime = true;
            for (int jindex = 2; jindex < index / 2; jindex++) {
                if (index % jindex == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                a[k] = index;
                k++;
            }
        }
        return a;
    }
}
