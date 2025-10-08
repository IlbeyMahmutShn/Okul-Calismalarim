package com.company;
import java.io.*;
public class Dosyaİslemler {
    public static void main(String[] args) throws IOException {
        File f = new File("Dosya.txt");
        String str = "/n3.yazdırma sonucu görülmektedir.";
        if (!f.exists()) {
            f.createNewFile();
        }//Eğer dopsya yoksa yeni dosya oluşturur.
        FileWriter fw = new FileWriter(f , true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        System.out.println("Dosya yazdırma işlemi başarılı bir şekilde gerçekleştirildi");
        bw.close();
    }
}
