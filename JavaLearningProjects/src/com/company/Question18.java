package com.company;

import java.util.Scanner;

public class Question18 {

    public static void Question18(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
    }
    public static void Question18(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        Question18(cumle,harf);
    }
}