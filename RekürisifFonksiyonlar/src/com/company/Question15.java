//Kendisine parametre olarak gelen 10 elemanlı sayı dizisinin küçükten büyüğe doğru sıralayan methodu yazınız.
//Bubble Sort
package com.company;

public class Question15 {
    public static void main(String[] args) {
        int [] A = {10,9,8,7,6,5,4,3,2,1};
        int [] sonuc = biggest_Number(A);
        for (int index = 0; index < sonuc.length; index++) {
            System.out.println(sonuc[index]);
        }
    }
    public static int [] biggest_Number(int [] a) {
        for (int jindex = 0; jindex < a.length; jindex++) {
            for (int kindex = 1; kindex < a.length - jindex; kindex++) {
                if (a[kindex - 1] > a[kindex]) {
                    int yedek = a[kindex - 1];
                    a[kindex - 1] = a[kindex];
                    a[kindex] = yedek;
                }
            }
        }
        return a;
    }
}
