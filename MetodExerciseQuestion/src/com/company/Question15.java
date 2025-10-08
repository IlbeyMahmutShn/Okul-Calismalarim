//Kendisine parametre olarak gelen Stringteki kelime sayısını geri döndüren methodu yazınız.
package com.company;

public class Question15 {
    public static void main(String[] args) {
        String word = "  Taner";
        int sonuc = string_temp(word);
        System.out.println(sonuc);
    }
    public static int string_temp(String str) {
        int numberHolder = 0;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z' || str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                numberHolder++;
            }
        }
        return numberHolder;
    }
}
