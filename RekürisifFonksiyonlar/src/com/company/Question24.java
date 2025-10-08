//
package com.company;

public class Question24 {
    public static void main(String[] args) {
        ikilik(11);

    }
    public static void ikilik(int n) {
        if (n == 0) {
            return;
        }
        else {
            ikilik(n/2);
            System.out.println(n%2);
        }
    }
}
