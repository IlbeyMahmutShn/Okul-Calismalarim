package com.company;

public class Question {
    public static void main(String[] args) {
        Bitki b = new Bitki("Ceviz" , "Agac" , "Fernor" , 5);
        Cam c = new Cam("Cam" , "Agac" , "Buzlu" , 5);
        b.goster();
        c.yaz();
    }
}

class Bitki {
    public String ismi, turu, cinsi;
    public int boyu;

    public Bitki() {
    }

    public Bitki(String ceviz, String agac, String fernor, int m) {
        this.ismi = ceviz;
        this.turu = agac;
        this.cinsi = fernor;
        this.boyu = m;
        goster();
    }

    public void goster() {
        System.out.println(ismi);
        System.out.println(turu);
        System.out.println(cinsi);
        System.out.println(boyu);
    }
}

    class Cam extends Bitki {
        public int yas;

        public Cam () {
        }

        public Cam (String a1 , String a2 , String a3 , int m) {
            super(a1,a2,a3,m);
            this.yas = 25;
            yaz();
        }
        public void yaz () {
            System.out.println(yas);
        }
    }