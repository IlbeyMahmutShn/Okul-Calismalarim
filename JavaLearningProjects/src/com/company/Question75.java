//ali.txt dosyası bulunmaktadır içindeki sayılar çiftmi tekmi ayıran ve bunları tek çift dosyalarına yazan java kodunu yazınız.
package com.company;
import java.io.*;
import java.util.Scanner;

public class Question75 {
    public static void main(String[] args) throws FileNotFoundException{
        File dosya = new File("Ali.txt");
        PrintWriter dosyacift = new PrintWriter("cift.txt");
        PrintWriter dosyatek = new PrintWriter("tek.txt");
        Scanner oku = new Scanner(dosya);
        int sayi;

        try {
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            while (oku.hasNextInt()) {
                sayi = oku.nextInt();
                if (sayi % 2 == 0) {
                    dosyacift.println(sayi);
                }
                else {
                    dosyatek.println(sayi);
                }
            }
        }
        catch(Exception e) {

        }
        dosyacift.close();
        dosyatek.close();
    }
}
