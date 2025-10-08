//Kendisine parametre olarak gelen 2 boyutlu sayısal dizi içindeki en büyük sayıyı bulup geri döndüren java programını yazınız.
//Yerinide geri dönder
package company;

public class Metod7 {
    public static void main(String[] args) {
        int a [][] = {{3,2,1,5},
                {4,5,7,7},
                {8,9,10,2}};
        int sonuc [] = enb_Bul(a);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
    public static int [] enb_Bul(int [][] a){
        int enb = a[0][0];
        int yeri = 0;
        int yerj = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (enb < a[i][j]) {
                    enb = a[i][j];
                    yeri = i + 1;
                    yerj = j + 1;
                }
            }
        }
        int b [] = new int[3];
        b[0] = enb;
        b[1] = yeri;
        b[2] = yerj;
        return b;
    }
}