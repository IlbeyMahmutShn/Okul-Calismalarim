//Parametre olarak gelen Stringin polindrommu değilmi kontrol eden rekürsif fonksiyon.
package com.company;

public class Question21 {
    public static void main(String[] args) {
        String word = "ABA";
        boolean sonuc = polindrom(word , 0 , word.length()-1);
        System.out.println(sonuc);
    }
    public static boolean polindrom(String a , int bas , int son) {
        if (bas == son) {
            return true;
        }
        else if (a.charAt(bas) != a.charAt(son)) {
            return false;
        }
        return polindrom(a , bas + 1 , son - 1);
    }
}
