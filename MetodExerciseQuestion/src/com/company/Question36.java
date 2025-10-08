package com.company;

public class Question36 {
    public static void main(String[] args) {
        String [][] word = {{"Taner"},{"Ahmet"}};
        String [][] word2 = {{"Ahmet"},{"Taner"}};
        String sonuc [][] = kelime_birlestir(word , word2);
        System.out.println(sonuc);
    }
    public static String [][] kelime_birlestir(String [][] str , String [][] str2) {
        String [][] dizi = new String[2][2];
        int k = 0;
        for (int index = 0; index < str.length; index++) {
            for (int jindex = 0; jindex < str2.length; jindex++) {
                dizi [index][jindex] = str [index][jindex] + str2 [index][jindex];
            }
        }
        return dizi;
    }
}
