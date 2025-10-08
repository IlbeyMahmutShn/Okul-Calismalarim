package com.company;

class ciftlik{
    public String isim;
    public int ahırsayısı;
    public ciftlik(String isim, int ahırsayısı){
        this.isim = isim;
        this.ahırsayısı = ahırsayısı;
    }
    public void yaz(){
        System.out.println("Çiftlik İsmi: " + isim + "\n " + "Toplam Ahır Sayısı: " + ahırsayısı);
    }
}
class domuz extends ciftlik{
    public int domuzsayısı;
    public domuz(String isim, int ahırsayısı, int domuzsayısı){
        super(isim, ahırsayısı);
        this.domuzsayısı = domuzsayısı;
    }
    public void yaz(){
        System.out.println("Ahır İsmi: " + isim + "\n " + "Ahır Sayısı: " + ahırsayısı + "\n" + "Domuz Sayısı: " + domuzsayısı);
    }
}
class inek extends ciftlik{
    public int ineksayısı;
    public inek(String isim, int ahırsayısı, int ineksayısı){
        super(isim, ahırsayısı);
        this.ineksayısı = ineksayısı;
    }
    public void yaz(){
        System.out.println("Ahır İsmi: " + isim + "\n " + "Ahır Sayısı: " + ahırsayısı + "\n" + "İnek Sayısı: " + ineksayısı);
    }
}
class at extends ciftlik{
    public int atsayısı;
    public at(String isim, int ahırsayısı, int atsayısı){
        super(isim, ahırsayısı);
        this.atsayısı = atsayısı;
    }
    public void yaz(){
        System.out.println("Ahır İsmi: " + isim + "\n " + "Ahır Sayısı: " + ahırsayısı + "\n" + "At Sayısı: " + atsayısı);
    }
}

class Ödev8 {

    public static void main(String[] args) {
        ciftlik a = new ciftlik("Danabank", 32);
        a.yaz();
        System.out.println("********");
        domuz b = new domuz("Domuz Ahırı", 8, 56);
        b.yaz();
        System.out.println("********");
        inek c = new inek("İnek Ahırı", 6, 48);
        c.yaz();
        System.out.println("********");
        at d = new at("At Ahırı", 11, 90);
        d.yaz();

    }

}
