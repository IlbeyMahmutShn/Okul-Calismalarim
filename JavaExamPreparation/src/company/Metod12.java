//2 X 2 tipinde rastgele matris oluşturuluyor sayısal matrisler elemanlar toplamı 50 den büyük olduğu zaman programın durması isteniyor.(Randomdan 0 ile 50 arası değer üretiniz.)
package company;

public class Metod12 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        total(a , b);
    }
    public static void total(int a[][] , int b[][]) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(50.0 * Math.random());
                b[i][j] = (int)(50.0 * Math.random());
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (total >= 50) {
                    System.out.println(total);
                    break;
                }
                total += a[i][j] + b[i][j];
            }
        }
    }
}
