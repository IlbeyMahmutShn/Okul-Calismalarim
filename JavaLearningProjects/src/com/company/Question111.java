//İki stringten büyük olanını ekrana yazdıran java kodunu yazınız.(Boyut olarak daha büyük olanı taner > TANER mesela)
package com.company;

import java.util.Scanner;

public class Question111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        System.out.println("Lütfen bir kelime giriniz");
        String word = scanner.nextLine();
        System.out.println("Lütfen bir kelime giriniz");
        String word2 = scanner.nextLine();

        for (int index = 0; index < word.length()-1; index++) {

            if (word.charAt(index) > word2.charAt(index)){
                a = 0;
                System.out.println(word);
                break;
            }
            else if (word.charAt(index) < word2.charAt(index)) {
                a = 0;
                System.out.println(word2);
                break;
            }
        }
        if (a == 1) {
            System.out.println("Eşit");
        }
    }
}