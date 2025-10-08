//Klavyeden girilen 2 tek boyutlu String dizisi içinde eşit olanları bulup ekrana yazan java programını yazınız.
package company;
import java.util.Scanner;

public class Metod18 {
    public static void main(String[] args) {
        esitmi();
    }
    public static void esitmi() {
        Scanner scanner = new Scanner(System.in);
        String a [] = new String[2];
        String b [] = new String[2];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Lütfen birinci stringi giriniz");
            a[i] = scanner.nextLine();
            System.out.println("Lütfen ikinci stringi giriniz");
            b[i] = scanner.nextLine();
            if (a[i].equals(b[i]) == true) {
                System.out.println(a[i]);
            }
        }
    }
}
