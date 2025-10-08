//Sadece bölme işleminde sadece topalama işlemi kullanarak bölümden kalan sayıyı bulunuz.
package company;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        Bolme(number , number2);
    }
    public static void Bolme(int x , int a) {
        int bolunen = 0;
        int bolen = 0;
        if (x > a) {
            bolunen = x;
            bolen = a;
        }
        else {
            bolunen = a;
            bolen = x;
        }
        for (;;) {
            if (bolen < bolunen) {
                bolunen = bolunen - bolen;

            }
            else {
                System.out.println(bolunen);
                break;
            }
        }
    }
}
