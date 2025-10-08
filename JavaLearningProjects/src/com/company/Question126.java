//İki sayının a üssü b'sini hesaplayan kodu ve metodu yazınız.
package com.company;

public class Question126 {
    public static void main(String[] args) {
        int x = 2 , y = 3;
        int sonuc =  us(x,y);
        System.out.println(sonuc);
    }
    public static int us(int x , int y) {
        int c = 1;
        for (int index = 1; index <= y; index++) {
            c *= x;
        }
        return c;
    }
}