//Faktoriyeli hesaplayan method.
package com.company;

public class Question132 {
    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);
    }
    public static int factorial(int a) {
        int f = 1;
        for (int index = 1; index <= a; index++) {
            f *= index;
        }
        return f;
    }
}
