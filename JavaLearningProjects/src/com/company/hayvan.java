package com.company;
class hayvan{
    public int ayaksayısı;
    public int tırnaksayısı;
    public hayvan(int ayaksayısı, int tırnaksayısı){
        this.ayaksayısı = ayaksayısı;
        this.tırnaksayısı = tırnaksayısı;
    }

}
class papagan extends hayvan{
    int yas;
    public papagan(int ayaksayısı, int tırnaksayısı, int yas){
        super(ayaksayısı,tırnaksayısı);
        this.ayaksayısı = ayaksayısı;
        this.tırnaksayısı = tırnaksayısı;
        this.yas = yas;
    }
    public void yasarttır(int yaslan){
        yas += yaslan;
    }
    public void yaz(){
        System.out.println("Ayak Sayısı: " + ayaksayısı + "\n" + "Tırnak Sayısı: " + tırnaksayısı + "\n" + "Yaş: " + yas);
    }
}

class Ödev2 {

    public static void main(String[] args) {
        papagan p = new papagan(2, 5, 3);
        p.yasarttır(3);
        p.yaz();
    }

}