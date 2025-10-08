//Klavyeden girilen stringi testen yazan java kodunu yazınız.
package com.company;
import java.util.Scanner;

public class Question80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first , last= "";
        first = scanner.nextLine();
        for (int index = 0; index <= first.length()-1; index++) {
            last = first.charAt(index) + last;

        }
        System.out.println(last);
    }
}