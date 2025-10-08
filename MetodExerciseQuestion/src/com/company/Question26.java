//Kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki en büyük sayıyı geri döndüren method yazınız.
package com.company;

public class Question26 {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4,5},{6,7,8,9,10}};
        int sonuc = biggest_number_Finder(A);
            System.out.println(sonuc);
    }
    public static int biggest_number_Finder(int [][] a) {
        int biggestNumber = a[0][0];
        for (int index = 1; index < a.length; index++) {
            for (int jindex = 1; jindex < a[0].length; jindex++) {
                if (biggestNumber < a[index][jindex]) {
                    biggestNumber = a[index][jindex];
                }
            }
        }
        return biggestNumber;
    }
}