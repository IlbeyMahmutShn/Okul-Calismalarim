//Kendisine parametre olarak gelen Stringteki küçük karakterleri büyük yapan sonucu geri döndüren methodu yapınız.
package com.company;

public class Question11 {
    public static void main(String[] args) {
        String word = "Taner";
        String sonuc = translate(word);
        System.out.println(sonuc);
    }
    public static String translate(String str) {
        return str.toUpperCase();
    }
}
