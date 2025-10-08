//

package com.company;

import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String d[] = new String[5];
        for (int index = 0; index < 5; index++) {
            d[index] = keyboard.nextLine();

            for (int jindex = 0; jindex < 5; jindex++){
                if (d[index].charAt(0) == 'A' || d[index].charAt(0) == 'a') {
                    System.out.println(d[index]);
                }
            }
        }
    }
}
