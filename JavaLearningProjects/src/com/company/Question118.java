//paramertre olarak gelen aynı eleman sayısına sahip 2 sayısal dizi içinde yerleri aynı olmak şartıyla
//b) eşit olan sayıları bulup geri döndüren methodları yazınınız.
package com.company;

public class Question118 {
    public static void main(String[] args) {
        int [] A = {1 , 2 , 4 , 8 , 9};
        int [] B = {1 , 2 , 6 , 9 , 8};
        int [] test = ortak_bul(A , B);
        for (int index = 0; index <= test.length-1; index++) {
            System.out.println(test [index]);
        }

    }
    public static int [] ortak_bul(int [] a , int [] b) {
        int []c = new int[a.length];
        int k = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index] == b[index]) {
                c[k] = a[index];
                k++;
            }
        }
        return c;
    }
}
