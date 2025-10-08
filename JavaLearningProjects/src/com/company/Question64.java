package com.company;

public class Question64 {
    public static void main(String[] args) {
        String [] c = {"a,b,c,d" , "a"};
        System.out.println(string_birlestir(c));
    }
    public static String string_birlestir(String a []) {
        String s = " ";
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
}
