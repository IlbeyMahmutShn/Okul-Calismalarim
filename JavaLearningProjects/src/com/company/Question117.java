//paramertre olarak gelen aynı eleman sayısına sahip 2 sayısal dizi içinde yerleri aynı olmak şartıyla
//a) eşit olan sayıları bulup ekrana yazan.
package com.company;

public class Question117 {
    public static void main(String[] args) {
        int [] d = {1 , 2 , 4 , 8 , 9};
        int [] d2 = {1 , 2 , 6 , 9 , 8};
        ortak_bul(d , d2);

    }
    public static void ortak_bul(int [] a , int [] b) {
        for (int index = 0; index < a.length; index++) {
            if (a[index] == b[index]) {
                System.out.println(a[index]);
            }
        }
    }
}
