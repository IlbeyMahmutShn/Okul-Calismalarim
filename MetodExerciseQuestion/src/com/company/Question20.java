//Kendisine parametre olarak gelen tamsayı dizisnin sıralı olup olmadığını geri döndüren method yazınız.
package com.company;

public class Question20 {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        boolean in_line = in_line_finder(A);
        System.out.println(in_line);
    }
    public static boolean in_line_finder(int [] a) {
        for (int index = 0; index < a.length-1; index++) {
            if (a[index] > a[index + 1]) {
                return false;
            }
        }
        return true;
    }
}