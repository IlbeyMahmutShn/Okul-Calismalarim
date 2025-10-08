//Kendisine parametre olarak gelen Stringteki küçük karakterlerin sayısını geri döndüren method yazınız.
package com.company;

public class Question9 {
    public static void main(String[] args) {
        String word = "Taner";
        int sonuc = little_word_Finder(word);
        System.out.println(sonuc);
    }
    public static int little_word_Finder(String str) {
        int numberHolder = 0;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
                numberHolder++;
            }
        }
        return numberHolder;
    }
}
