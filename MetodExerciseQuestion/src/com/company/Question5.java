//n.fibonacci sayısını geri dönderen method yazınız.
package com.company;

public class Question5 {
    public static void main(String[] args) {
        int number = 5;
        int sonuc = fibonacci_Finder(number);
        System.out.println(sonuc);
    }
    public static int fibonacci_Finder(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int index = 2; index < n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
