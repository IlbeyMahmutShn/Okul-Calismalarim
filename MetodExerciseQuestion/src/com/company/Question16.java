//Kendisine parametre olarak gelen Stringte 'a' karakterinin olup olmadığını geri döndüren method yazınız.
package com.company;

public class Question16 {
    public static void main(String[] args) {
        String word = "Taner";
        String sonuc = a_Finder(word);
        System.out.println(sonuc);
    }
    public static String a_Finder(String str) {
        String word2 = "Var";
        String word3 = "Yok";
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == 'a') {
                return word2;
            }
        }
        return word3;
    }
}
