package com.company;
import java.io.*;
import java.util.Scanner;


public class Dosyaİslemleri6 {
    public static void main(String[] args) {
        File f = new File("Dosya.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            if (!f.exists())
                f.createNewFile();
            PrintStream p = new PrintStream(new FileOutputStream(f , true));
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "Öğrenci adı");
                String isim = scanner.nextLine();
                System.out.println(i + "Öğrenci vize");
                int vize = scanner.nextInt();
                System.out.println(i + " Öğrenci final");
                int final0 = scanner.nextInt();
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
