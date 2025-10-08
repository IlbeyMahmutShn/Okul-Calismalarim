package com.company;

class Araba {
    public int hiz;
    public int vites;
    public String marka;
    public String model;

    public Araba(int hiz, int vites, String marka, String model) {
        this.hiz = hiz;
        this.vites = vites;
        this.marka = marka;
        this.model = model;
    }

    public void hizArtttir(int arttir) {
        hiz += arttir;
    }

    public void fren(int azalt) {
        hiz -= azalt;
    }

    public String toString() {
        return ("marka : " + marka + "  model : " + model + "  Hız : " + hiz);
    }
}

class SportAraba extends Araba {
    public int yerdenYukseklik;

    public SportAraba(String marka, String model, int hiz, int vites, int yukseklik) {
        super(hiz, vites, marka, model);
        yerdenYukseklik = yukseklik;
    }

    public void yuksekligiAyarla(int yeniDeger) {
        yerdenYukseklik = yeniDeger;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n" + "  yerden yükseklik : " + yerdenYukseklik);
    }
}

public class Test {
    public static void main(String[] args) {
        SportAraba mustang1 = new SportAraba("Ford", "Mustang", 360, 6, 20);
        System.out.println();

        Araba mustang = new Araba(300, 6, "Ford", "Mustang");
        System.out.println(mustang.toString());
        mustang.hizArtttir(20);
        mustang.fren(100);
        System.out.println(mustang.toString());

        mustang1.yuksekligiAyarla(30);
        System.out.println(mustang1.toString());

        SportAraba AlfaRomeo1 = new SportAraba("Alfa Romeo", "GIULIA", 350, 6, 15);
        System.out.println();

        Araba AlfaRomeo = new Araba(320, 6, "Alfa Romeo", "GIULIA");
        System.out.println(AlfaRomeo.toString());
        AlfaRomeo.hizArtttir(25);
        AlfaRomeo.fren(100);
        System.out.println(AlfaRomeo.toString());

        AlfaRomeo1.yuksekligiAyarla(20);
        System.out.println(AlfaRomeo1.toString());

        SportAraba Bugatti1 = new SportAraba("Bugatti", "Veyron", 365, 6, 20);
        System.out.println();

        Araba Bugatti = new Araba(300, 6, "Bugatti", "Veyron");
        System.out.println(Bugatti.toString());
        Bugatti.hizArtttir(30);
        Bugatti.fren(110);
        System.out.println(Bugatti.toString());

        Bugatti1.yuksekligiAyarla(35);
        System.out.println(Bugatti1.toString());
    }
}
