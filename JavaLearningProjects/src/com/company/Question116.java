//Kendisine parametre olarak gelen bir tane String içindeki küçük a harflerinin sayısını bulup geri döndüren methodu static ve static olamyan şekliyle yapınız.
package com.company;

public class Question116 {
    public static void main(String[] args) {
        Question116 x = new Question116();
        int t = x.bul("aliveliosman");
        System.out.println(t);
    }

    public int bul(String s) {
        int sayaç = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == 'a') {
                sayaç++;
            }
        }
        return (sayaç);
    }
}