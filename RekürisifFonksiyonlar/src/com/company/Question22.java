package com.company;

public class Question22 {
    public static void main(String[] args) {
        String word = "ABA";
        boolean sonuc = palindrom(word , 0 , word.length()-1);
        System.out.println(sonuc);
    }
    public static boolean palindrom(String s , int bas , int son) {
        while (bas < son) {
            if (s.charAt(bas) != s.charAt(son)) {
                return false;
            }
            else {
                bas += 1;
                son -= 1;
            }
        }
        return true;
    }
}
