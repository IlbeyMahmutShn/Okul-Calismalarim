package com.company;

public class Question82 {

    public static void main(String[] args) {
        String word = "Taner";
        String txt = "";
        int n = word.length();
        String sonuc = ters_cevir(word ,  txt , n);
        System.out.println(sonuc);
    }
    public static String ters_cevir(String str , String txt , int n) {
        txt += str.charAt(str.length() - 1);
        if (n == 0) {
            return txt;
        }
        else {
            return ters_cevir(str , txt , n -1);
        }
    }
}
