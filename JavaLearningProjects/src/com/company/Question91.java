package com.company;

public class Question91 {
    public static void main(String[] args) {
        int [][]dizi = {{1,5,4,3},{7,9,8,7}};
        int [][]sonuc = arrangement_control(dizi ,2, 4);

        for (int index = 0; index < 2; index++) {
            for (int jindex = 0; jindex < 4; jindex++) {
                System.out.println(sonuc[index][jindex] + "");
            }
            System.out.println("");
        }
    }
    public static int[][] arrangement_control(int [][]matris , int satir , int sutun) {
        int x;
        for (int index = 0; index < satir; index++) {
            for (int jindex = 0; jindex < sutun-1; jindex++) {
                for (int kindex = jindex+1; kindex < sutun; kindex++) {
                    if (matris[index][jindex] > matris[index][kindex]) {
                        x = matris[index][jindex];
                        matris[index][jindex] = matris[index][kindex];
                        matris[index][kindex] = x;
                    }
                }
            }
        }
        return matris;
    }
}
