package com.company;

class dünya{
    public int ülkesayısı;
    public int nüfussayısı;
    public dünya(int ülkesayısı, int nüfussayısı){
        this.ülkesayısı = ülkesayısı;
        this.nüfussayısı = nüfussayısı;
    }
    public void artar(int art){
        nüfussayısı += art;
    }
    public void yaz(){
        System.out.println("Ülke Sayısı: " + ülkesayısı + "\n" + "Nüfus Sayısı: " + nüfussayısı);
    }
}
class Ödev6 {

    public static void main(String[] args) {
        dünya d = new dünya(208, 79240000);
        d.artar(100000);
        d.yaz();
    }

}