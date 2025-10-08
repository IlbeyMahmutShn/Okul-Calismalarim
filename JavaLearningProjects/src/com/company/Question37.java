package com.company;

public class Question37 {
    public static void main(String[] args) {
        String word = "Taner";
        String word2 = "taner";
        String ortak = "";
        String shortword;

        if (word.length() > word2.length()) {
            shortword = word2;

        }
        else {
            shortword = word;

        }
        for (int index = 0; index < shortword.length(); index++) {
            if (word.charAt(index) == word2.charAt(index)) {
                ortak = ortak + word.charAt(index);

            }
        }
        System.out.println("Ortak karakterler : " + ortak);
    }
}
