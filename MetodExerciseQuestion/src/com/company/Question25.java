//Vize ve final notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp geri döndüren method yazınız.
package com.company;

public class Question25 {
    public static void main(String[] args) {
        int [] vize = {100 , 100 , 100};
        int [] final0 = {100 , 100 , 100};
        int [] sonuc = average_Finder(vize , final0);
        for (int kindex = 0; kindex < sonuc.length; kindex++) {
            System.out.println(sonuc[kindex]);
        }
    }
    public static int [] average_Finder(int [] a , int [] b) {
        int [] total = new int[1];
        int [] total0 = new int[1];
        int numberHolder = 0;
        int numberHolder1 = 0;
        for (int index = 0; index < a.length; index++) {
            total [0] += a[index];
            numberHolder++;
        }
        total [0] /= numberHolder;
        for (int jindex = 0; jindex < b.length; jindex++) {
            total0 [0] += b[jindex];
            numberHolder1++;
        }
        total0 [0] /= numberHolder1;
        int [] average = new int[1];
        average [0]= (int) ((total [0] * 0.4) + (total0 [0] * 0.6));
        return average;
    }
}