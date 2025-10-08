//Kendisine parametre olarak gelen Stringi ters çevirip geri döndüren methodu yazınız.
package com.company;

public class Question10 {
    public static void main(String[] args) {
        String word = "Taner";
        String sonuç = downsizing(word);
        System.out.println(sonuç);
    }
    public static String downsizing(String str) {
        String word2 = "";
        for (int index = str.length()-1; index >= 0; index--) {
            word2 += str.charAt(index);
        }
        return word2;
    }
}
