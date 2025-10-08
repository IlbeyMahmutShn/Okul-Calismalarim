//Kendisine parametre olarak gelen bir tane String içindeki küçük a harflerinin sayısını bulup geri döndüren methodu static ve static olamyan şekliyle yapınız.
package com.company;

public class Question115 {
    public static void main(String[] args) {
        int t;
        t = bul("aliveliosman");
        System.out.println(t);

    }
    public static int bul(String s) {
        int sayac = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == 'a') {
                sayac++;
            }
        }
        return (sayac);
    }
}