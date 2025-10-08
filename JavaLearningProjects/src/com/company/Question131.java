//Kendisine parametre olarak gelen 10 elemanlı 2 tam sayılı dizisinin toplamını geri döndüren methodu yazınız.
package com.company;

public class Question131 {
    public static void main(String[] args) {
        int[] d = {1,5,3,4,6,10};
        int[] d2 = {3,1,5};
        System.out.println(toplambul(d , d2));
    }

    public static int toplambul(int [] a , int [] b) {
        int total = 0;
        int total2 = 0;
        int top = 0;
        for (int index = 0; index < a.length; index++) {
            total += a[index];
        }
        for (int index = 0; index < b.length; index++) {
            total2 += b[index];
        }
        top = total + total2;
        return top;
    }
}
//3 dizi ile yap.