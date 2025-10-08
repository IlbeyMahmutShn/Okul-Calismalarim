package com.company;

public class Question89 {
    public double [][] matrisislem(double [][]matris , int satir , int sutun) {
        double [][]sonuc = new double[satir][3];
        double ek;
        double eb;
        double ort;

        for (int index = 0; index < satir; index++) {
            ek = matris[index][0];
            eb = 0;
            ort = 0;
            for (int jindex = 0; jindex < sutun; jindex++) {
                if (matris[index][jindex] > eb) {
                    eb = matris [index][jindex];

                }
                if (matris[index][jindex] < ek) {
                    ek = matris[index][jindex];

                }
                ort = ort + matris[index][jindex];
            }
            ort = ort / sutun;
            sonuc[index][0] = eb;
            sonuc[index][1] = ek;
            sonuc[index][2] = ort;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Question3 mt = new Question3();
        //  double [][]matris = {(1,2,3,4,),(),()} ;
        //double [][]sonuç = mt.matrisislem(matris , 3 , 4);

        for (int index = 0; index < 3; index++) {
            for (int jindex = 0; jindex < 3; jindex++) {
                //      System.out.println(sonuç[index][jindex] + " ");
            }
            System.out.println(" ");
        }
    }
}
