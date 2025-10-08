package com.company;
import javax.management.StringValueExp;
import java.util.Scanner;

public class Question66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c [] = new String[5];
        int no [] = new int[c.length];
        int not [] = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.next();
            no[i] = scanner.nextInt();
            not[i] = scanner.nextInt();
        }
        String sonuc [] = ogrenci(c , no , not);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
    public static String [] ogrenci(String [] a , int [] no , int [] not) {
        int total = 0;
        double ort = 0;
        int k = 0;
        String s2[] = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            total += not[i];
        }
        ort = total / a.length;
        for (int j = 0; j < a.length; j++) {
            if (ort < not[j]) {
                s2[k] = String.valueOf(not[j]);
                s2[k+1] = a[j];
                k++;
            }
        }
        return s2;
    }
}
