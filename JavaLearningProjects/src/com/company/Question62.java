package com.company;

public class Question62 {
    public static void main(String[] args) {
        String s [][] = {{"Aliveli"},{"Mehmetosman"}};
        String sonuc [] = stringFinder(s);
        System.out.println(sonuc[0] + sonuc[1]);

    }
    public static String [] stringFinder(String s [][]) {
        int enb = s[0][0].length(); String smax = s[0][0];
        int enk = s[0][0].length(); String smin = s[0][0];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (enb < s[i][j].length()) {
                    enb = s[i][j].length();
                    smax = s[i][j];

                }
                if (enk > s[i][j].length()) {
                    enk = s[i][j].length();
                    smin = s[i][j];
                }
            }
        }
        String s2 [] = {smax , smin};
        return (s2);
    }
}
