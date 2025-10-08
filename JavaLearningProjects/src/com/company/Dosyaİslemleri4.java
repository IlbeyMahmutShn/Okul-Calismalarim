package com.company;
import java.io.*;
import java.util.Scanner;


public class Dosyaİslemleri4 {
    public static void main(String[] args) {
        File f = new File("Dosya.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            if (!f.exists())
                f.createNewFile();
            PrintStream p = new PrintStream(new FileOutputStream(f , true));
            System.out.println("5 sayı gir");
            for (int i = 0; i < 4; i++) {
               int sayi = scanner.nextInt();
               p.println(sayi);
            }
            System.out.println("Yazma işlemi bitti");
            p.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
