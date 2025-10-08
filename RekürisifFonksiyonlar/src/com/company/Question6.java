//Kendisine parametre olarak gelen n tam sayısına karşılık fibonacci sayısını hesaplayan rekürsif fonksiyon.
package com.company;
public class Question6 {
    public static void main(String[] args) {
        long sonuc = fibonacci_Finder(6);
        System.out.println(sonuc);
    }
    public static long fibonacci_Finder(long a) {
        if (a == 0 || a == 1) {
            return a;
        }
        else {
            return (fibonacci_Finder(a - 1) + fibonacci_Finder(a - 2));
        }
    }
}
