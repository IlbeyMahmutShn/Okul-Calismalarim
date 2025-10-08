//Kendisine parametre olarak gelen Stringteki küçük karakterleri büyük , büyük karakterleri küçük yapıp geri döndüren methodu yazınız.
package com.company;

public class Question12 {
    public static void main(String[] args) {
        String word = "Taner";
        String sonuc = translate(word);
        System.out.println(sonuc);
    }
    public static String translate(String str) {
        String word2 = "";
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
                word2 = word2 + (char)(str.charAt(index)-32);

            }
            else if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                word2 = word2 + (char)(str.charAt(index)+32);

            }
            else {
                word2 = word2 + str.charAt(index);

            }
        }
        return word2;
    }
}
