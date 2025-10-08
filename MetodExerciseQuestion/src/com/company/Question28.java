//Kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki herbir satırın toplamını  geri döndüren method yazınız.
package com.company;

public class Question28 {
    public static void main(String[] args) {
        int[][] A = {{1 ,2},{10}};
        int sonuc = biggest_number_Finder(A);
        System.out.println(sonuc);
    }

    public static int biggest_number_Finder(int[][] a) {
        int total = 0;
        for (int index = 0; index < a.length; index++) {
            for (int jindex = 0; jindex < a[0].length; jindex++) {
                total += a[index][0];

            }
        }
        return total;
    }
}