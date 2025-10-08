//Klavyeden rastgele stringler giriliyor ilk karakteri 'A' olanları ve son karakteri 'Z' olanları bulup ekrana yazan ve Q yada q harfi yazılırsa programdan çıkan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        int numberHolder = 0;
        String word = scanner.nextLine();

        for (int index = 0; index < word.length()-1; index++) {



            if (word.charAt(0) == 'A' && word.charAt(numberHolder) == 'Z') {
                System.out.println("İlk harfi A son harfi Z olan kelimeler :" + " " + word);break;
            }
            else if (word.charAt(index) == 'Q' || word.charAt(index) == 'q') {
                System.out.println("Girilen cümlede Q veya q vardır");
                System.exit(1);break;

            }
            numberHolder++;
        }
    }
}