package com.company;

public class Question85 {
    public static void main(String[] args) {
        String word = "Taner";
        boolean sonuc = char_Finder(word , 0);
        System.out.println(sonuc);
    }
    public static boolean char_Finder(String str , int n) {
        if (str.length()-1 == n) {
            return false;
        }
        else if (str.charAt(n) == 'T') {
            return true;
        }
        return char_Finder(str , n + 1);
    }
}
