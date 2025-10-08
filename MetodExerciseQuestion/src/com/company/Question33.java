//Kendisine parametre olarak gelen tamsayının asal olup olmadığını geri döndüren method.
package com.company;

public class Question33 {
    public static void main(String[] args) {
        int number = 3;
        String sonuc = prime_Finder(number);
        System.out.println(sonuc);
    }
    public static String prime_Finder(int a) {
        for (int index = 2; index < a; index++) {
            if (a % index == 0) {
                return "asal değil";
            }
        }
        return "asal";
    }
}
