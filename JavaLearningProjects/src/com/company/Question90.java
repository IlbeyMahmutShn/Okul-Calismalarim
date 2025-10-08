package com.company;

public class Question90 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        arrangement_control(A);
        System.out.println(arrangement_control(A));


    }
    public static boolean arrangement_control(int []a) {
        for (int index = 0; index < a.length-1; index++) {
            if (a[index] > a[index + 1]) {
                return false;
            }
        }
        return true;
    }
}
