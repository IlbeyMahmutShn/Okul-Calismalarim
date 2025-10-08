//Kendisine parametre olarak gelen String dizesindeki en uzun Stringin olduğu indisi geri dönderen methodu yazınız.
package com.company;

public class Question22 {
    public static void main(String[] args) {
        String [] word = {"Ahmet","Ali","Bilgisayar"};
        int sonuc = biggest_word(word);
        System.out.println(sonuc);
    }
    public static int biggest_word(String [] a) {
        int enb = a[0].length();
        int yer = 0;
        for (int index = 0; index < a.length; index++) {
            if (enb < a[index].length()) {
                enb = a[index].length();
                yer = index;

            }
        }
        return yer;
    }
}
