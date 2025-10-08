//Kendisine parametre olarak gelen dizinin simetrik olup olmadığını hesaplayan rekürsif fonksiyon.
package com.company;

public class Question9 {
    public static void main(String[] args) {
         int [] number = {1,2,3,1};
         boolean sonuc = polinom(number , 0 , number.length-1);
             System.out.println(sonuc);
    }
    public static boolean polinom(int [] n , int bas , int son) {
        if (bas == son) {
            return true;
        }
        else if (n[bas] != n[son]) {
            return false;
        }
        return polinom(n , bas + 1 , son - 1);
    }
}
