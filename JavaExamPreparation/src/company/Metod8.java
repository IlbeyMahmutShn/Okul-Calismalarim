//İki boyutlu sayısal dizi içindeki ilk en büyük ve en küçük değeri ve yerini geri dönderen java programını yazınız.
package company;

public class Metod8 {
    public static void main(String[] args) {
        int a[][] = {{3, 2, 1, 5},
                {4, 5, 7, 7},
                {8, 9, 10, 2}};
        int sonuc[] = enb_enk_Bul(a);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }

    public static int[] enb_enk_Bul(int[][] a) {
        int enb = a[0][0];
        int yeri = 0;
        int yerj = 0;
        int enk = a[0][0];
        int yerki = 0;
        int yerkj = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (enb < a[i][j]) {
                    enb = a[i][j];
                    yeri = i + 1;
                    yerj = j + 1;
                }
                if (enk > a[i][j]) {
                    enk = a[i][j];
                    yerki = i + 1;
                    yerkj = j + 1;
                }
            }
        }
        int b[] = new int[6];
        b[0] = enb;
        b[1] = yeri;
        b[2] = yerj;
        b[3] = enk;
        b[4] = yerki;
        b[5] = yerkj;
        return b;
    }
}
