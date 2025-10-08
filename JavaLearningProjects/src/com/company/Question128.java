//Stringten girilen küçük karakterelerin sayısını geri döndüren kodu ve metodu yazınız.
package com.company;

public class Question128 {
    public static void main(String[] args) {
        String word = "AhMet";
        say(word);
        System.out.println(say(word));
    }
    public static int say(String a) {
        int numberHolder = 0;
        for (int index = 0; index < a.length(); index++) {
            if (a.charAt(index) >= 'a' && a.charAt(index) <= 'z') {
                numberHolder++;
            }
        }
        return  numberHolder;
    }
}
