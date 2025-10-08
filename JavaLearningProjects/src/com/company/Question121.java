//Klavyeden girilmiş olan tek boyutlu String dizisi içinde
//a)En uzun Stringi bulup geri döndüren
package com.company;

public class Question121 {
    public static void main(String[] args) {
        String []word = {"Ali","Veli","Osman","Ayşe","Bilgisayar"};
        bulalım(word);
        System.out.println(bulalım(word));

    }
    public static String bulalım(String [] a) {
        String amax = a[0];
        int enb = a[0].length();
        for (int index = 0 ; index < a.length; index++) {
            if (enb < a[index].length()) {
                enb = a[index].length();
                amax = a[index];

            }
        }
        return amax;
    }
}
