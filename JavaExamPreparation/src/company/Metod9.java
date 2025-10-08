//Birim matris bulan java programını yazınız.
package company;

public class Metod9 {
    public static void main(String[] args) {
        int a [][] = {{1,0},
                       {0,1}};
        boolean sonuc = birim_Matris(a);
        System.out.println(sonuc);
    }
    public static boolean birim_Matris(int a [][]) {
        boolean b = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a.length == a[0].length) {
                    if (i == j) {
                        if (a[i][j] == 1) {
                            b = true;
                        }
                        else {
                            b = false;
                            break;
                        }
                    }
                }
            }
        }
        return b;
    }
}
