package com.company;

public class Kutuphane {
    public int kisi_sayisi;
    public int calistigi_ders_sayisi;
    public String isim;
    public String soyisim;

    public Kutuphane(int kisi_sayisi, int calistigi_ders_sayisi, String isim, String soyisim) {
        this.kisi_sayisi = kisi_sayisi;
        this.calistigi_ders_sayisi = calistigi_ders_sayisi;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public void kisi_sayisi_arttir(int arttir) {
        kisi_sayisi += arttir;
    }

    public void kisi_sayisi_azalt(int azalt) {
        kisi_sayisi -= azalt;
    }

    public String toString() {
        return ("isim : " + isim + " soyisim : " + soyisim + "  kişi sayısı : " + kisi_sayisi);
    }
}
class ErkekSayisi extends Kutuphane {
    public int erkekSayisi;
    public ErkekSayisi(int kisi_sayisi, int calistigi_ders_sayisi, String isim, String soyisim , int erkekler) {
        super(kisi_sayisi , calistigi_ders_sayisi , isim , soyisim);
        erkekSayisi = erkekler;
    }
    public void Erkek_sayisindaki_artis(int yeniDeger) { erkekSayisi = yeniDeger;
    }
    @Override
    public String toString() {
        return (super.toString() + "\n" + "  Erkek sayısı : " + erkekSayisi);
    }
}
class Kutuphane_TEST {
    public static void main(String[] args) {
        ErkekSayisi Ahmet1 = new ErkekSayisi(400 , 1 , "Ahmet", "Elipek" , 300);
        System.out.println();

        Kutuphane Ahmet = new Kutuphane(400, 1, "Ahmet", "Elipek");
        System.out.println(Ahmet.toString());
        Ahmet.kisi_sayisi_arttir(20);
        Ahmet.kisi_sayisi_azalt(30);
        System.out.println(Ahmet.toString());

        Ahmet1.Erkek_sayisindaki_artis(10);
        System.out.println(Ahmet1.toString());


        ErkekSayisi Yilmaz1 = new ErkekSayisi(250 , 2 , "Yılmaz", "Alp" , 200);
        System.out.println();

        Kutuphane Yilmaz = new Kutuphane(250, 2, "Yılmaz", "Alp");
        System.out.println(Yilmaz.toString());
        Yilmaz.kisi_sayisi_arttir(20);
        Yilmaz.kisi_sayisi_azalt(40);
        System.out.println(Yilmaz.toString());

        Yilmaz1.Erkek_sayisindaki_artis(10);
        System.out.println(Yilmaz1.toString());


        ErkekSayisi Yunus1 = new ErkekSayisi(400 , 1 , "Yunus", "Yavuz" , 210);
        System.out.println();

        Kutuphane Yunus = new Kutuphane(400, 1, "Yunus", "Yavuz");
        System.out.println(Yunus.toString());
        Yunus.kisi_sayisi_arttir(20);
        Yunus.kisi_sayisi_azalt(20);
        System.out.println(Yunus.toString());

        Yunus1.Erkek_sayisindaki_artis(10);
        System.out.println(Yunus1.toString());


        ErkekSayisi Fatih1 = new ErkekSayisi(1000 , 1 , "Fatih", "Altuntaş" , 600);
        System.out.println();

        Kutuphane Fatih = new Kutuphane(1000, 1, "Fatih", "Altuntaş");
        System.out.println(Fatih.toString());
        Fatih.kisi_sayisi_arttir(20);
        Fatih.kisi_sayisi_azalt(50);
        System.out.println(Fatih.toString());

        Fatih1.Erkek_sayisindaki_artis(15);
        System.out.println(Fatih1.toString());


        ErkekSayisi Mert1 = new ErkekSayisi(500 , 5 , "Mert", "Mahmut" , 400);
        System.out.println();

        Kutuphane Mert = new Kutuphane(500, 5, "Mert", "Mahmut");
        System.out.println(Mert.toString());
        Mert.kisi_sayisi_arttir(20);
        Mert.kisi_sayisi_azalt(70);
        System.out.println(Mert.toString());

        Mert1.Erkek_sayisindaki_artis(15);
        System.out.println(Mert1.toString());


        ErkekSayisi Nisa1 = new ErkekSayisi(100 , 0 , "Nisa", "Aktaş" , 40);
        System.out.println();

        Kutuphane Nisa = new Kutuphane(120, 0, "Nisa", "Aktaş");
        System.out.println(Nisa.toString());
        Nisa.kisi_sayisi_arttir(20);
        Nisa.kisi_sayisi_azalt(10);
        System.out.println(Nisa.toString());

        Nisa1.Erkek_sayisindaki_artis(15);
        System.out.println(Nisa1.toString());


        ErkekSayisi Furkan1 = new ErkekSayisi(1000 , 1 , "Furkan", "Hacı" , 700);
        System.out.println();

        Kutuphane Furkan = new Kutuphane(1000, 1, "Furkan", "Hacı");
        System.out.println(Furkan.toString());
        Furkan.kisi_sayisi_arttir(100);
        Furkan.kisi_sayisi_azalt(120);
        System.out.println(Furkan.toString());

        Furkan1.Erkek_sayisindaki_artis(50);
        System.out.println(Furkan1.toString());


        ErkekSayisi Yusuf1 = new ErkekSayisi(50 , 2 , "Yusuf", "Berk" , 2);
        System.out.println();

        Kutuphane Yusuf = new Kutuphane(120, 2, "Yusuf", "Berk");
        System.out.println(Yusuf.toString());
        Yusuf.kisi_sayisi_arttir(30);
        Yusuf.kisi_sayisi_azalt(10);
        System.out.println(Yusuf.toString());

        Yusuf1.Erkek_sayisindaki_artis(4);
        System.out.println(Yusuf1.toString());


        ErkekSayisi Fatihc1 = new ErkekSayisi(100 , 4 , "Fatih", "Can" , 2);
        System.out.println();

        Kutuphane Fatihc = new Kutuphane(100, 4, "Fatih", "Can");
        System.out.println(Fatihc.toString());
        Fatihc.kisi_sayisi_arttir(30);
        Fatihc.kisi_sayisi_azalt(50);
        System.out.println(Fatihc.toString());

        Fatihc1.Erkek_sayisindaki_artis(10);
        System.out.println(Fatihc1.toString());


        ErkekSayisi Bilal1 = new ErkekSayisi(1200 , 7 , "Bilal", "Çevik" , 1000);
        System.out.println();

        Kutuphane Bilal = new Kutuphane(1200, 7, "Bilal", "Çevik");
        System.out.println(Bilal.toString());
        Bilal.kisi_sayisi_arttir(200);
        Bilal.kisi_sayisi_azalt(100);
        System.out.println(Bilal.toString());

        Bilal1.Erkek_sayisindaki_artis(1000);
        System.out.println(Bilal1.toString());
    }
}
