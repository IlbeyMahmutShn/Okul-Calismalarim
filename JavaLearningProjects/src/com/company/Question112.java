//Bir tam sayının bölenlerini ekrana yazan java kodunu yazınız.
package  com.company;

import java.util.Scanner;

public class Question112 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = keyboard.nextInt();

        for (int index = 1; index <= number; index++) {

            if (number % index == 0) {
                System.out.println(index);
            }
        }
    }
}