package com.company;

public class Hastalik {
        boolean ates;
        boolean bogaz_agrisi;
        boolean burun_akintisi;
        boolean nefes_darligi;

    Hastalik() {
        bogaz_agrisi = true;
        System.out.println("Boğaz ağrısı : " + bogaz_agrisi);
    }

    public class Covid19 {
        Covid19() {
            ates = true;
            nefes_darligi = true;
        }
        public void CovidYazdir() {
            System.out.println("Ateş : " + ates);
            System.out.println("Nefes darlığı : " + nefes_darligi);
        }
    }
    public class Influenza{
        Influenza() {
            burun_akintisi = true;

        }
        public void InfluenzaYazdir() {
            System.out.println("Burun akıntısı : " + burun_akintisi);
        }
    }

    public static void main(String[] args) {
        System.out.println("Covid19 belirtileri");
        Hastalik.Covid19 cvd = new Hastalik().new Covid19();
        cvd.CovidYazdir();
        System.out.println(" ");
        System.out.println("Influenza belirtileri");
        Hastalik.Influenza inf = new Hastalik().new Influenza();
        inf.InfluenzaYazdir();
    }
}
