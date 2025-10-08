//Kendisine parametre olarak gelen dizide kaç tane küçük karakter vardır rekürsif fonksiyon.
package com.company;

public class Question11 {
    public static void main(String[] args) {
        String word = "Taner";
        int numberHolder = 0;
        int sonuc = little_letter_Finder(word , numberHolder , 1);
        System.out.println(sonuc);
    }
    public static int little_letter_Finder(String a , int holder , int n) {
        if (a.length() == n) {
            return holder;
        }
        else if (a.charAt(n) >= 'a' && a.charAt(n) <= 'z') {
            holder++;
        }
        return little_letter_Finder(a , holder , n + 1);
    }
}
