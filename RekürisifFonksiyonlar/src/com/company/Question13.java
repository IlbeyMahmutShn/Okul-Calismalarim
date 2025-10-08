//Kendisine parametre olarak gelen Stringi ters çeviren rekürisif fonksiyon.
package com.company;

public class Question13 {
    public static void main(String[] args) {
        String word = "bardağ";
        String sonuc = reverse_the_word(word , 0);
        System.out.println(sonuc);

    }
    public static String word2 = "";
    public static String reverse_the_word(String str , int n) {
        if (str.length() == n) {
            return word2;
        }
        else {
            word2 += str.charAt(str.length() - 1 - n);
        }
        return reverse_the_word(str , n + 1);
    }
}
