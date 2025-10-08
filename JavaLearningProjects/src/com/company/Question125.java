//Kendisine parametre olarak gelen iki tam sayı arasındaki (a>b) sayıların toplamını hesaplayıp geri gönderen ana programı ve metodu yazınız.
package com.company;

public class Question125 {
    public static void main(String[] args) {
        int x = 10 , y = 5;
        int a =  finder(x,y);
        System.out.println(a);
    }
    public static int finder(int x , int y) {
        int total = 0;
        for (int index = y; index <= x; index++) {
            total += index;
        }
        return total;
    }
}