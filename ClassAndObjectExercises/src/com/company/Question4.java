package com.company;

public class Question4 {
    public static void main(String[] args) {
        personel p = new personel();
        ogrenci o = new ogrenci();
        p.personelyazdır("Taner", "Tarlacı", 10);
        o.ogrenciyazdır("Mahmut", 1, "Bm");
    }
}

class personel {
    public String ad;
    public String soyad;
    private int calışmayılı;

    public personel() {
    }

    // erişimi public yaptık
    public void personelyazdır(String ad, String soyad, int calışmayılı) {
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(calışmayılı);
    }
}

class ogrenci {
    public String isim;
    public int sinif;
    public String bolum;

    public ogrenci() {
    }

    // parametre sırasına dikkat ettik
    public void ogrenciyazdır(String isim, int sınıf, String bolum) {
        System.out.println(isim);
        System.out.println(sınıf);
        System.out.println(bolum);
    }
}
