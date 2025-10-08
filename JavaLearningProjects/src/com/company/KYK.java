package com.company;

class KYK{
    public String isim;
    public int odasayısı;
    public KYK(String isim, int odasayısı){
        this.isim = isim;
        this.odasayısı = odasayısı;
    }
}
class AhmetKabaklı extends KYK{
    public int kisisayisi;
    public AhmetKabaklı(String isim, int odasayısı, int kisisayisi){
        super(isim, odasayısı);
        this.kisisayisi = kisisayisi;
    }
    public void art(int arttir){
        kisisayisi += arttir;
    }
    public void azalt(int azalt){
        kisisayisi -= azalt;
    }
    public void yaz(){
        System.out.println("İsim: " + isim + "\n" + "Oda Sayısı: " + odasayısı + "\n" + "Kişi Sayısı: " + kisisayisi);
    }
}
class Ödev4 {

    public static void main(String[] args) {
        AhmetKabaklı ak = new AhmetKabaklı("Ahmet Kabaklı", 350, 2800);
        ak.art(100);
        ak.yaz();
    }

}
