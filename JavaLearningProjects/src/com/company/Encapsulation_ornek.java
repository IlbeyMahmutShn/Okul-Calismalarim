package com.company;

public class Encapsulation_ornek {
    public static void main(String[] args) {
        Encapsulation_deneme obj = new Encapsulation_deneme();
        obj.setadi("Ali");
        obj.setyasi(32);
        obj.setnumara(112233);
        System.out.println("İşçinin adi : " + obj.getadi());
        System.out.println("İşçinin numarası : " + obj.getnumara());
        System.out.println("İşçinin yaşi : " + obj.getyasi());
    }
}
