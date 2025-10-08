//ali.txt dosyası bulunmaktadır içindeki sayılar çiftmi tekmi ayıran ve bunları tek çift dosyalarına yazan java kodunu yazınız.
package com.company;
import java.io.*;
import java.util.Scanner;

public class Question71 extends Thread {

    public static void main(String[] args) throws FileNotFoundException {
        File dosya = new File("Ali.txt");

        PrintWriter dosyacift = new PrintWriter("tek.txt");
        PrintWriter dosyatek = new PrintWriter("cift.txt");
        Scanner oku = new Scanner(dosya);

        try {
            while (oku.hasNextInt()) {
                Thread.sleep(5000);
                int sayi = oku.nextInt();

                if (sayi % 2 == 0) {
                    dosyacift.println(sayi);
                }
                else {
                    dosyatek.println(sayi);
                }
                System.out.println(sayi);
            }
        }
        catch (Exception e) {
        }
        dosyacift.close();
        dosyatek.close();
    }
}
