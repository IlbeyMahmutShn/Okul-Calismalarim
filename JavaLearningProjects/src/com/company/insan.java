package com.company;
class insan{
    public int ayaksayısı;
    public int parmaksayısı;
    public insan(int ayaksayısı, int parmaksayısı){
        this.ayaksayısı = ayaksayısı;
        this.parmaksayısı = parmaksayısı;
    }
}
class Erkan extends insan{
    public int dişsayısı;
    public Erkan(int ayaksayısı, int parmaksayısı, int dişsayısı){
        super(ayaksayısı, parmaksayısı);
        this.dişsayısı = dişsayısı;
    }
    public void yaz(){
        System.out.println("Ayak Sayısı: " + ayaksayısı + "\n" + "Parmak Sayısı: " + parmaksayısı + "\n" + "Diş Sayısı: " + dişsayısı);
    }
}
class Ödev3 {

    public static void main(String[] args) {
        Erkan e = new Erkan(2, 20, 33);
        e.yaz();
    }

}