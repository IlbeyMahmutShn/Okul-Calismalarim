//taş kağıt makas
package com.company;

import java.util.Random;

import java.util.Scanner;

public class tasKagıtMakas2 {
    public static void main(String[] args) {
        int user1 , pc , pcScor = 0, user1scor = 0;
        Random r = new Random();
        pc = r.nextInt(3)+1;
        System.out.println("pc :" + pc);
        System.out.println("1.Taş");
        System.out.println("2.Kağıt");
        System.out.println("3.Makas");

        for (int index = 0; index < 10; index++) {

            System.out.println("Lütfen bir sayı giriniz");
            Scanner scanner = new Scanner(System.in);
            user1 = scanner.nextInt();

            if (user1 != 1 && user1 != 2 && user1 != 3) {
                System.out.println("Geçersiz bir sayı girdiniz");
            } else {
                if (user1 == pc) {
                    System.out.println("Berabere");
                }
                if (pc == 1 && user1 == 2) {
                    System.out.println("Kullanıcı kazandı");
                    user1scor++;
                }
                if (pc == 1 && user1 == 3) {
                    System.out.println("Pc kazandı");
                    pcScor++;
                }
                if (pc == 2 && user1 == 1) {
                    System.out.println("Pc kazandı");
                    pcScor++;
                }
                if (pc == 2 && user1 == 3) {
                    System.out.println("Kullanıcı kazandı");
                    user1scor++;
                }
                if (pc == 3 && user1 == 1) {
                    System.out.println("Kullanıcı kaznadı");
                    user1scor++;
                }
                if (pc == 3 && user1 == 2) {
                    System.out.println("Pc kazandı ");
                    pcScor++;
                }
            }
            System.out.println("Kullanıcı Scor :" + user1scor + "  " + "Pc Scor :" + pcScor);
        }
    }
}
