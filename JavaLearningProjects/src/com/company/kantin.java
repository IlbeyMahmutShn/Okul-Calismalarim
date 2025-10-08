package com.company;

class kantin{
    public String renk;
    public int kira;
    public kantin(String renk, int kira){
        this.renk = renk;
        this.kira = kira;
    }
    public void ozellikler(){
        System.out.println("Kantin Rengi: " + renk + "\n" + "Kantin Kirası: " + kira);
    }
}
class yiyecekler extends kantin{
    public int yiyeceksayısı;
    public String yiyecektürü;
    public yiyecekler(String renk, int kira, int yiyeceksayısı, String yiyecektürü){
        super(renk, kira);
        this.yiyeceksayısı = yiyeceksayısı;
        this.yiyecektürü = yiyecektürü;
    }
    public void yiyeceközellikleri(){
        System.out.println("Yiyecek Sayısı: " + yiyeceksayısı + "\n" + "Yiyecek Türü: " + yiyecektürü);
    }
}
class icecekler extends kantin{
    public int iceceksayısı;
    public String icecektürü;
    public icecekler(String renk, int kira, int iceceksayısı, String icecektürü){
        super(renk, kira);
        this.iceceksayısı = iceceksayısı;
        this.icecektürü = icecektürü;
    }
    public void yiyeceközellikleri(){
        System.out.println("İçecek Sayısı: " + iceceksayısı + "\n" + "İçecek Türü: " + icecektürü);
    }

}
class Ödev9 {

    public static void main(String[] args) {kantin k = new kantin("mavi", 2000);
        k.ozellikler();
        System.out.println(" ");
        yiyecekler y = new yiyecekler("mavi", 2000, 80, "Meyve Suyu");
        y.yiyeceközellikleri();
        System.out.println(" ");
        icecekler i = new icecekler("mavi", 2000, 40, "Tost");
        i.yiyeceközellikleri();
    }

}
