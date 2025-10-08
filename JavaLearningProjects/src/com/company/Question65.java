package com.company;

public class Question65 {
    public static void main(String[] args) {
        String a [] = {"Ahmet" , "Mehmet" , "Ali"};
        String sonuc [][] = stringTopla(a);
        for (int i = 0; i < sonuc.length; i++) {
            for (int j = 0; j < sonuc[0].length; j++) {
                System.out.println(sonuc[i][j]);
            }
        }
    }
    public static String [][] stringTopla(String [] a) {
        String c [][] = new String[3][1];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = a[i];
            }
        }
        return c;
    }
}
