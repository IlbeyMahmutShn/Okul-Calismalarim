//3 X 3 elemana sahip rastgele 2 tane matris oluşturuluyor bu iki matrisin toplamını ekrana yazan java programını yazınız.
package company;

public class Metod11 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        total(a , b);
    }
    public static void total(int a[][] , int b[][]) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(1000.0 * Math.random());
                b[i][j] = (int)(500.0 * Math.random());
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                total += a[i][j] + b[i][j];
            }
        }
        System.out.println(total);
    }
}
