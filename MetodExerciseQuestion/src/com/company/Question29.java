//Kendisine parametre olarak gelen iki boyutlu String dizesindeki en uzun Stringi geri döndüren method.
package com.company;

public class Question29 {
    public static void main(String[] args) {
        String [][] word = {{"Ahmet" , "Bilgisayar"},{"Ali" , "Mehmet"}};
        String sonuc = longgest_word_Finder(word);
        System.out.println(sonuc);
    }
    public static String longgest_word_Finder(String [][] a) {
        String longgest_word = a[0][0];
        for (int index = 0; index < a.length; index++) {
            for (int jindex = 0; jindex < a[0].length; jindex++) {
                if (a[index][jindex].length() > longgest_word.length()) {
                    longgest_word = a[index][jindex];
                }
            }
        }
        return longgest_word;
    }
}
