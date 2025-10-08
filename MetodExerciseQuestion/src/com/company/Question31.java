//Kendisine parametre olarak gelen 10 elemanlı tamsayı dizisini 1 sağa döndüren ve diziyi ana methoda geri döndüren method.
package com.company;

public class Question31 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9,10};
        int [] sonuc = right_spinner(A);
        for (int jindex = 0; jindex < 10; jindex++) {
            System.out.println(sonuc[jindex]);
        }
    }
    public static int [] right_spinner(int [] a) {
        int yedek = a [9];
        for (int index = a.length - 2; index >= 0; index--) {
            a[index + 1] = a[index];
        }
        a[0] = yedek;
        return a;
    }
}
