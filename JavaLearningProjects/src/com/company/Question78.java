package com.company;

public class Question78 {
    public static void main(String[] args) {
        Cam c = new Cam("kozalak" , "kozalak" ,"kozalak");
        Bitki b = new Bitki();
        b.goster();
        c.goster();
    }
}
class Bitki {
    public String ismi , turu , cinsi;
    public Bitki() {
        ismi = "Ağaç";
        turu = "Ceviz";
        cinsi = "Fernor";
    }
    public Bitki(String i ,String t ,String c) {
        this.ismi = i;
        this.turu = t;
        this.cinsi = c;
        goster();
    }
    public void goster() {
        System.out.println(ismi);
        System.out.println(turu);
        System.out.println(cinsi);
    }
}
class Cam extends Bitki {
    public Cam() {
        ismi = "Ağaç";
        turu = "Cam";
        cinsi = "Kozalak";
    }
    public Cam(String i , String t , String c) {
        this.ismi = i;
        this.turu = t;
        this.cinsi = c;
    }
}

