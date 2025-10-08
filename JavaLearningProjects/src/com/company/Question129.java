//Stringten girilen a karakterlerinin sayısını geri döndüren kodu ve metodu yazınız.
package com.company;

public class Question129 {
    public static void main(String[] args) {
        String word = "AhMeta";
        say(word);
        System.out.println(say(word));
    }
    public static int say(String a) {
        int numberHolder = 0;
        for (int index = 0; index < a.length(); index++) {
            if (a.charAt(index) == 'A' || a.charAt(index) == 'a') {
                numberHolder++;
            }
        }
        return  numberHolder;
    }
}