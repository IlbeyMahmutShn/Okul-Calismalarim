//Kendisine parametre olarak gelen pozitif tam sayıya kadar olan sayıların toplamını geri döndüren.
package com.company;

public class Question2 {
    public static void main(String[] args) {
        int number = total(5);
        System.out.println(number);
    }
    public static int total(int a) {
        if (a == 0) {
            return 0;
        }
        else {
            return a + total(a - 1);
        }
    }
}
