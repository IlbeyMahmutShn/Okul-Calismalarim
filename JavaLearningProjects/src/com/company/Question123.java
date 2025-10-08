//2 Boyutlu String dizisi içindeki en kısa karaktere sahip String ile en uzun karaktere sahip Stringi bulup geri döndüren methodu yazınınz.
package com.company;

public class Question123 {
    public static void main(String[] args) {
        String [][]d = {{"Ali" , "Mehmet"},{"Osman" , "kemal"}};
        String [] t = max_min_String_bul(d);
        for (int index = 0; index < t.length; index++) {
            System.out.println(t[index]);
        }
    }
    public static String [] max_min_String_bul(String [][]a) {
        String amax = a[0][0];
        int enb = a[0][0].length();
        String amin = a[0][0];
        int enk = a[0][0].length();
        for (int index = 0; index < a.length; index++) {
            for (int jindex = 0; jindex < a[0].length; jindex++) {
                if (enb < a[index][jindex].length()) {
                    enb = a[index][jindex].length();
                    amax = a[index][jindex];
                }
                if (enk > a[index][jindex].length()) {
                    enk = a[index][jindex].length();
                    amin = a[index][jindex];
                }
            }
        }
        String d2[] = {amax , amin};
        return d2;
    }
}
