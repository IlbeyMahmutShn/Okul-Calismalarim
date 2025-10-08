//Stringi tersten yazdıran method.
package com.company;

import java.util.Scanner;

public class Question86 {

    public String Reverse(String veri) {
        char c;
        String ters_string = "";
        for (int i = 0; i < veri.length(); i++) {
            c = veri.charAt(i);
            ters_string += c;
        }
        return ters_string;
    }

    public static void main(String[] args) {
        Question86 m = new Question86();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = keyboard.next();

        String sonuç = m.Reverse(kelime);
        System.out.println(sonuç);


    }
}
