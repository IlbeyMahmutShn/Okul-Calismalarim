//Kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki en büyük sayının indisini geri döndüren method yazınız.
package com.company;

public class Question27 {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4,5},{6,7,8,9,10}};
        int [] sonuc = biggest_number_Finder(A);
        for (int kindex = 0; kindex < sonuc.length; kindex++) {
            System.out.println(sonuc[kindex]);
        }
    }
    public static int [] biggest_number_Finder(int [][] a) {
        int biggestNumber = a[0][0];
        int yeri = 0;
        int yerj = 0;
        for (int index = 1; index < a.length; index++) {
            for (int jindex = 1; jindex < a[0].length; jindex++) {
                if (biggestNumber < a[index][jindex]) {
                    biggestNumber = a[index][jindex];
                    yeri = index;
                    yerj = jindex;
                }
            }
        }
        int [] dizi = new int[2];
        dizi [0] = yeri;
        dizi [1] = yerj;
        return dizi;
    }
}