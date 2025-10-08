//Kendisine parametre olarak gelen Stringi tersten yazan methodu yazınız.
package com.company;

public class Question133 {
    public static void main(String[] args) {
        String s = ters("Taner");
        System.out.println(s);
    }
    public static String ters(String a) {
        String wordHolder = "";
        for (int index = 0; index < a.length(); index++) {
            wordHolder = a.charAt(index) + wordHolder;

        }
        return wordHolder;
    }
}
