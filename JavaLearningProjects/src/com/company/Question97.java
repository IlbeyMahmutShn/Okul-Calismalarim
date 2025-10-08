//Klavyeden girilen kordinat noktasının hangi bölgede ollduğunu ekrana yazan java kodunu yazınız.
package com.company;

import java.util.Scanner;

public class Question97 {

    public static void main(String[] args) {
        Scanner axis = new Scanner(System.in);
        System.out.println("Lütfen bir x kordinat değeri giriniz");
        int xAxis = axis.nextInt();
        System.out.println("Lütfen bir y kordinat değeri giriniz");
        int yAxis = axis.nextInt();

        if (xAxis == 0 && yAxis == 0){
            System.out.println("Nokta orjindedir");
        }
        else if (xAxis > 0 && yAxis > 0){
            System.out.println("1 Bölgededir");
        }
        else if (xAxis < 0 && yAxis > 0){
            System.out.println("2. Bölgededir");
        }
        else if (xAxis < 0 && yAxis < 0){
            System.out.println("3. Bölgededir");
        }
        else if (xAxis > 0 && yAxis < 0){
            System.out.println("4. Bölgededir");
        }
    }
}