//Birim matris oluşturan java programını yazınız.
package company;

public class Metod10 {
    public static void main(String[] args) {
        int a[][] = new int [2][2];
        birim_Matris_Olustur(a);
    }
    public static void birim_Matris_Olustur(int a [][]) {
        boolean b = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a.length == a[0].length) {
                    if (i == j) {
                        a[i][j] = 1;
                    }
                    else {
                        a[i][j] = 0;
                    }
                }
            }
        }
    }
}
