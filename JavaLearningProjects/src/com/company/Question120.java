//Kendisine parametre olarak gelen sayısal dizinin değerini 2 arttırıp geri döndüren methodu yazınız.
//b)iki boyutlu dizi ile yapınız.
package com.company;

public class Question120 {
    public static void main(String[] args) {
        int [][]d = {{1 , 3 , 5 , 7 , 9},{2 , 4 , 6 , 8}};
        donder(d);
    }
    public static void donder(int [][]a) {
        for (int index = 0; index < a.length; index++) {
            for (int jindex = 0; jindex < a[0].length; jindex++) {
                a[index][jindex] += 2;
                System.out.println(a[index][jindex]);
            }
        }
    }
}
