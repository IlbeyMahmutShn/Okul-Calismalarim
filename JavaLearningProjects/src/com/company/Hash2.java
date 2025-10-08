package com.company;

import java.util.Arrays;
import java.util.Random;

public class Hash2 {
    public static int [] QuadraticProbing(int [] hash, int sayi, int yer){
        for (int i = 1; i < 4; i++) {
            int yer1 = yer + (i * i);
            if (hash[yer1] == 0) {
                hash[yer1] = sayi;
                break;
            }
        }
        return hash;
    }
    public static int [] hash(int [] hash, int sayi){
        Random rastgele = new Random();
        int yer = 0;
        String s = "";
        for (int i = 0; i < hash.length; i++) {
            sayi = rastgele.nextInt(100);
            s += sayi + " - ";
            yer = sayi % 15;
            if (hash[yer] != 0) {
                QuadraticProbing(hash, sayi, yer);
            }
            else{
                hash[yer] = sayi;
            }
        }
        System.out.println(s);
        return hash;
    }
    public static void main(String[] args) {
        int [] hash = new int [25];
        int [] hash2 = new int [25];
        hash2 = hash(hash, 0);
        System.out.println(Arrays.toString(hash2));
    }

}
