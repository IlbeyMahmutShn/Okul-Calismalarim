package com.company;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question95 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("İki sayı gir");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sonuc = x/y;
            System.out.println(x + " " + y + " " + sonuc);

        } catch (InputMismatchException e) {
            System.out.println("Tip İstisnası");
            e.printStackTrace();
        }
        catch (Exception e) { //ArithmeticExeption aritmetik hatalar 0 a bölünme hatası birden çok catch açılabilir.
            System.out.println("Sıfıra bölünme hatası");
            System.out.println(e.getMessage());
            e.printStackTrace(); //Hatayı saymaya yarıyor.

        }
    }
}
