//Kendisidne parametre olarak gelen pozitif tam sayı kadar ekrana adınızı yazan.
package com.company;

public class Question5 {
    public static void main(String[] args) {
        name(5);
    }
    public static void name(int a) {
        if (a > 0) {
            System.out.println("Taner");
            name(a - 1);
        }
    }
}