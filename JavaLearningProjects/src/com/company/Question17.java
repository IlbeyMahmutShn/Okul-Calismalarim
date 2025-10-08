package com.company;

class cember {
    double ycap;

    cember() {
        ycap = 0;
    }
    cember(double x) {
        ycap = x;
    }
    double alanHesapla() {
        return Math.PI*ycap*ycap;
    }
}
public class Question17 {
    public static void main(String[] args) {
        cember c = new cember();
        cember c1 = new cember(2.0);
        cember c2 = new cember(3.8);
        System.out.println(c.alanHesapla());
        System.out.println(c1.alanHesapla());
        System.out.println(c2.alanHesapla());
    }
}