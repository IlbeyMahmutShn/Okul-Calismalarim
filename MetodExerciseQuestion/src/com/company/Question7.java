//Kendisine parametre olarak gelen pozitif tamsayıya kadarki tüm tamsayıları toplayıp geri döndüren method yazınız.
package com.company;

public class Question7 {
    public static void main(String[] args) {
        int number = 10;
        int sonuc = total(number);
        System.out.println(sonuc);
    }
    public static int total(int n) {
        int total = 0;
        for (int index = 0; index <= n; index++) {
            total += index;
        }
        return total;
    }
}
