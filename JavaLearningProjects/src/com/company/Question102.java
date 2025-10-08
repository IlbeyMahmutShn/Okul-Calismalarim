//Klavyeden girilen n'inci sayıya denk gelen fibonaci sayılarını ekrana yazan java kodunu yaznız.
package com.company;

import java.util.Scanner;

public class Question102 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int n3, n , i;
        System.out.println("N sayısını giriniz");
        n = scanner.nextInt();
        System.out.print(n1 + " " + n2);

        for (i = 2; i < n; ++i){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}