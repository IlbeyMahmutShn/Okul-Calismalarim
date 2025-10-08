package com.company;

class takim{
    public String isim;
    public int şampiyonluksayısı;
    public int yıldızsayısı;
    public takim(String isim, int şampiyonluksayısı, int yıldızsayısı){
        this.isim = isim;
        this.şampiyonluksayısı = şampiyonluksayısı;
        this.yıldızsayısı = yıldızsayısı;
    }

}
class FB extends takim{

    public FB(String isim, int şampiyonluksayısı, int yıldızsayısı){
        super(isim, şampiyonluksayısı, yıldızsayısı);
    }
    public void yaz(){
        System.out.println("İsim: " + isim + "\n" + "Şampiyonluk Sayısı: " + şampiyonluksayısı + "\n" + "Yıldız Sayısı: " + yıldızsayısı);
    }
}
class GS extends takim{

    public GS(String isim, int şampiyonluksayısı, int yıldızsayısı){
        super(isim, şampiyonluksayısı, yıldızsayısı);
    }
    public void yaz(){
        System.out.println("İsim: " + isim + "\n" + "Şampiyonluk Sayısı: " + şampiyonluksayısı + "\n" + "Yıldız Sayısı: " + yıldızsayısı);
    }
}
class BJK extends takim{

    public BJK(String isim, int şampiyonluksayısı, int yıldızsayısı){
        super(isim, şampiyonluksayısı, yıldızsayısı);
    }
    public void yaz(){
        System.out.println("İsim: " + isim + "\n" + "Şampiyonluk Sayısı: " + şampiyonluksayısı + "\n" + "Yıldız Sayısı: " + yıldızsayısı);
    }
}
class Ödev7 {

    public static void main(String[] args) {
        FB a = new FB("Fenerbahçe", 28, 5);
        a.yaz();
        System.out.println("********");
        GS b = new GS("Galatsaray", 22, 4);
        b.yaz();
        System.out.println("********");
        BJK c = new BJK("Beşiktaş jimnastik Kulübü", 21, 4);
        c.yaz();
        System.out.println("********");
    }

}