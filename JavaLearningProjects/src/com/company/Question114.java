//50 öğrencinin vize ve finaline göre geçip kaldığını bulan java kodunu yazınız.(notlar rastgele girilecek)
package com.company;

import java.util.Random;

public class Question114 {
    public static void main(String[] args) {
        Random random = new Random();
        int vize , final0 , numberHolder = 0;

        for (int index = 0; index < 50; index++) {
            vize = random.nextInt(100);
            final0 = random.nextInt(100);

            if (final0 >= 50 && vize % 40 + final0 % 60 >= 50) {
                numberHolder++;

            }
            System.out.println("Vize :" + " " + vize + " " + "Final :" + " " + final0);
        }
        System.out.println("Dersi geçen öğrenci sayısı :" + " " + numberHolder);
        System.out.println("Dersten kalan öğrenci sayısı :" + " " + (50 - numberHolder));
    }
}
