package com.company;
import java.io.*;
import java.util.Scanner;


public class Dosyaİslemleri5 {
    public static void main(String[] args) {
        File f = new File("Deneme.txt");
        Scanner oku = null;
        try {
            if (!f.exists())
            System.out.println("Dosya mevcud değil");
            else
                oku = new Scanner(f);
            while (oku.hasNext()) {
                int sayi = oku.nextInt();
                System.out.println(sayi+"/t");
            }
            oku.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}