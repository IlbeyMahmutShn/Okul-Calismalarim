//Kendisine parametre olarak gelen
package com.company;

public class Question88 {

    public static void main(String[] args) {
        int result = cubeNumber(12);

        if (result != 0) {
            System.out.println(result);
        }
        else {
            System.out.println("Girilen sayı küp bir sayı değildir");
        }
    }
    public static int cubeNumber(int number) {
        int cube;
        for (int index = 0; index < number; index++) {
            cube = index * index * index;

            if (cube == number) {
                return index;
            }
            else if (cube > number) {
                return index;
            }
        }
        return 1;
    }
}
