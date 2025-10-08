//Kendisine parametre olarak gelen Stringteki "aa" Stringlerinden kaç tane olduğunu geri döndüren method yazınız.
package com.company;

public class Question13 {
    public static void main(String[] args) {
        String word = "aaaaaabb";
        int sonuc = aa_Finder(word);
        System.out.println(sonuc);
    }
    public static int aa_Finder(String str) {
        int numberHolder = 0;
        for (int index = 0; index < str.length()-1; index++) {
            if (str.charAt(index) == 'a' || str.charAt(index+1) == 'a') {
                numberHolder++;
                index++;
            }
        }
        return numberHolder;
    }
}
