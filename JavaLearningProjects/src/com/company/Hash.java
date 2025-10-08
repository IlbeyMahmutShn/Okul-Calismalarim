package com.company;

import java.util.Arrays;
import java.util.Random;

public class Hash {
    public static int []  linearprobing(int [] hash, int sayi, int k){
        for (int i = k; i < hash.length; i++) {
            if (hash[i] == 0) {
                hash[i] = sayi;
                break;
            }
            else if(i == hash.length-1){
                i = 0;
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
                linearprobing(hash, sayi, yer);
            }
            else{
                hash[yer] = sayi;
            }
        }
        System.out.println(s);
        return hash;
    }
    public static void main(String[] args) {
        int [] hash = new int [20];
        int [] hash2 = new int [20];
        hash2 = hash(hash, 0);
        /*
        for (int i = 0; i < hash.length; i++) {
            System.out.println(hash2[i] + i);
        }
        */
        System.out.println(Arrays.toString(hash2));
    }

}
