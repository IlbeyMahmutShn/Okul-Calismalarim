//Kendisine parametre olarak gelen iki stringten büyük olanını geri döndüren method yazınız.
package com.company;

public class Question14 {
    public static void main(String[] args) {
        String word = "Taner";
        String word2 = "taner";
        String sonuc = biggest_string_Finder(word , word2);
        System.out.println(sonuc);

    }
    public static String biggest_string_Finder(String str , String str2) {
        String esit = "Eşit";
        for (int index = 0; index < str.length()-1; index++) {
            if (str.charAt(index) > str2.charAt(index)) {
                return str;
            }
            else if (str.charAt(index) < str2.charAt(index)) {
                return str2;
            }
        }
        return esit;
    }
}
