//Kendisine parametre olarak gelen 3x3 lük A ve B matrislarinin toplamını geri döndüren method.
package com.company;

public class Question30 {
    public static int ocTaner(int[][][] a, int[][][] b){
        int total=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int m=0;m<a[0][0].length;m++){
                    total += a[i][j][m] + b[i][j][m];
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] aa=new int[3];
        int[][][] a={{{1,2,3},{4,5,6},{7,8,9}},{{11,12,13},{14,15,16},{17,18,19}},{{20,21,22},{23,24,25},{26,27,28}}};
        int[][][] b={{{1,2,3},{4,5,6},{7,8,9}},{{11,12,13},{14,15,16},{17,18,19}},{{20,21,22},{23,24,25},{26,27,28}}};

        System.out.println(ocTaner(a,b));
    }
}
