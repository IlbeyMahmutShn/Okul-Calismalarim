//Rekürsif fonksiyon ile faktöriyel hesaplama.
//döngü kullanılmaz , değişken kullanılmaz.
//belli programların doğası gereği daha kullanışlı olması nedeni ile tercih edilir.
package com.company;

public class Question {

    public static void main(String[] args) {
        int number = fak(5);
        System.out.println(number);
    }
    public static int fak(int a) {
        if (a == 1) {
            return 1;
        }
        else {
            return a * fak(a - 1);
        //bu işlemin sonunda classın başına döner.
        }
    }
}
