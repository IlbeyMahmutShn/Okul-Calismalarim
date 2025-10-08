package com.company;
import java.io.*;       //Yanlış düzelt

public class Dosyaİslemler2 {
    public static void main(String[] args) throws IOException {
        File f = new File("Dosya.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Dosyadan okunan veri");
        while ((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();
    }
}
