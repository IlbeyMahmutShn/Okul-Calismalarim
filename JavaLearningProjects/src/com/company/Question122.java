//Klavyeden girilmiş olan tek boyutlu String dizisi içinde
//b)Hem en uzun Stringi hemde onun yerini geri döndüren methodu yazınız.
package com.company;

import java.util.Arrays;

public class Question122 {
    public static void main(String[] args) {
        String []word = {"Ali","Veli","Osman","Ayşe","Bilgisayar"};
        String[] t;
        t = bulalım(word);
        System.out.println(Arrays.toString(t));

    }
    public static String [] bulalım(String [] a) {
        String d[] = new String[2];
        String amax = a[0];
        int enb = a[0].length();
        int yer = 0;
        for (int index = 1; index < a.length; index++) {
            if (enb < a[index].length()) {
                enb = a[index].length();
                amax = a[index];
                yer = index;

                d[0] = amax;
                d[1] = Integer.toString(yer);
            }
        }
        return d;
    }
}