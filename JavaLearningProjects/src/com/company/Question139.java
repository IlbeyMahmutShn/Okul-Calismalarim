package com.company;

public class Question139 {
    public static void main(String[] args) {
        int []A = new int[100 - 51];
        int y = 0;
        for (int x = 51; x < 100; x++) {
            A[y] = x;
            y++;
        }
        int [] prime = prime_finder(A);
        for (int kindex = 0; kindex <= prime.length ; kindex++) {
            System.out.println(prime[kindex]);
        }
    }
    public static int [] prime_finder(int []a) {
        int k = 0;
        boolean isprime = true;
        for (int index = a[0]; index < a[51]; index++) {
            isprime = true;
            for (int jindex = 2; jindex < index / 2; jindex++) {
                if (index % jindex == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                a[k] = index;
                k++;
            }
        }
        return a;
    }
}