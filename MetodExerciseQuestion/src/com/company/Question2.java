//Kendisine parametre olarak gelen 2 tamsayının a üssü b'sini hesaplayıp geri döndüren method yazınınz.
package com.company;

public class Question2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int sonuc = us(x , y);
        System.out.println(sonuc);

    }
    public static int us(int a , int b) {
        int ustel = 1;
        for (int index = 0; index < b; index++) {
            ustel *= a;
        }
        return ustel;
    }
}