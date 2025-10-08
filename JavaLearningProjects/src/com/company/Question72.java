package com.company;
import java.io.*;
import java.util.Scanner;

public class Question72 {
    public static void main(String[] args) {
        File dosya = new File("dosya");
        Scanner klavye = new Scanner(System.in);
        try {

            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            PrintWriter yaz = new PrintWriter(dosya);
            String kelime = klavye.nextLine();
            yaz.println(kelime);
            yaz.close();
        }
        catch (Exception e) {

        }
    }
}
