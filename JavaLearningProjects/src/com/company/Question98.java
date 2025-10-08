//Klavyeden iki tam sayı giriliyor + - * / işlemlerini yapıp ve ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question98 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir oparatör seçiniz (+,-,*,/)");
        String oparator = scanner.nextLine();
        System.out.println("Lütfen ilk sayıyı giriniz");
        int numberfirst = scanner.nextInt();
        System.out.println("Lütfen ikinci değeri giriniz");
        int numbersecond = scanner.nextInt();

        switch (oparator){
            case "+" : System.out.println("SONUÇ:" +(numberfirst + numbersecond));break;
            case "-" : System.out.println("SONUÇ:" +(numberfirst - numbersecond));break;
            case "*" : System.out.println("SONUÇ:" +(numberfirst * numbersecond));break;
            case "/" : System.out.println("SONUÇ:" +(numberfirst / numbersecond));break;
            default : System.out.println("Listede olmayan bir işlem seçtiniz");
        }
    }
}