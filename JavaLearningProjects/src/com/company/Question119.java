//Kendisine parametre olarak gelen sayısal dizinin değerini 2 arttırıp geri döndüren methodu yazınız.
//a)bir boyutlu dizi ile yapınız.
package com.company;

public class Question119 {
    public static void main(String[] args) {
        int [] d = {1 , 3 , 5 , 7 , 9};
        donder(d);
    }
    public static void donder(int [] a) {
        for (int index = 0; index < a.length; index++) {
            a[index] += 2;
            System.out.println(a[index]);
        }
    }
}
