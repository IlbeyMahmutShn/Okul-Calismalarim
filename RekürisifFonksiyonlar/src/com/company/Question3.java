//Kendisine parametre olarak gelen pozitif tam sayının kaç basamaklı olduğunu geri döndüren
package com.company;

public class Question3 {
    public static void main(String[] args) {
        int sonuc = step_Finder(1024);
        System.out.println(sonuc);
    }
    public static int step_Finder(int a) {
        if (a >= 0 && a < 10) {
            return 1;
        }
        else {
            return 1 + step_Finder(a / 10);
        }
    }
}
