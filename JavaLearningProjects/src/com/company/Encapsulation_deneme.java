package com.company;

public class Encapsulation_deneme {
    private int numara;
    private String adi;
    private int yasi;

    public int getnumara() {
        return numara;
    }
    public String getadi() {
        return adi;
    }
    public int getyasi() {
        return yasi;
    }
    public void setyasi(int yas) {
        yasi = yas;
    }
    public void setadi(String ad) {
        adi = ad;
    }
    public void setnumara(int no) {
        numara = no;
    }
}
