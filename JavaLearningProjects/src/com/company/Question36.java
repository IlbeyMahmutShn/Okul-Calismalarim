package com.company;

public class Question36 {
    public static void main(String[] args) {

        String word = "aaabbbcccddddeee";
        int numberHolder = 1;
        String word2 = "";
        word = word + " ";

        for (int index = 0; index < word.length()-1; index++) {
            if (word.charAt(index)==word.charAt(index + 1)) {
                numberHolder++;

            }
            else {
                word2 = word2 + word.charAt(index) + Integer.toString(numberHolder);
                numberHolder = 1;
            }
        }
        System.out.println(word2);
    }
}
