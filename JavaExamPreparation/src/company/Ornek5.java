//Bilgisayar çarpma toplama çıkarma işlemlerini sadece toplama üzerinden yapabilir buna göre çarpma kullanmadan n * n sayısıbnı hesaplayan programı yazınız.
package company;
import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Carpma(n);

    }
    public static void Carpma(int x) {
        int sonuc = 0;
        for (int i = 0; i < x; i++) {
            sonuc += x;
        }
        System.out.println(sonuc);
    }
}
