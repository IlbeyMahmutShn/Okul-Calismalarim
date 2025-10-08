package com.company;
import java.util.*;

public class Question94 {

    public static void main(String[] args) {
        char karakter [] = new char [10];
        String ifade = "abcadefgab";
        String sonuc = "";
        int sayac = 1;
        boolean vy = false;

        for (int i = 0; i < ifade.length(); i++) {
            for (int j = i+1; j < ifade.length(); j++) {
                if (ifade.charAt(i) == ifade.charAt(j)) {
                    sayac++;
                }
            }
            for (int k = 0; k < karakter.length; k++) {
                if (karakter[k] == ifade.charAt(i)) {
                    vy = true;
                    break;
                }
                if (vy == false) {
                    sonuc += ifade.charAt(i) + sayac;
                    karakter[k] = ifade.charAt(i);
                    k++;
                }
                sayac = 1;
                vy = false;
            }
            System.out.println(sonuc);
        }
    }
}
