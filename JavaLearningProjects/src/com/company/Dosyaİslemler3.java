package com.company;
import java.io.*;

public class Dosyaİslemler3 {
    public static void main(String[] args) {
        File f = new File("Dosya.txt");
        if (f.exists())
            System.out.println("Dosya bulunmadığı için ");
        else
           f.delete();
        System.out.println(f);
    }
}
