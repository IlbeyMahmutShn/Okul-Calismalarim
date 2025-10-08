//Kendisine parametre olarak gelen sayının işaretini bulan java programını yazınız.
package company;
import java.util.Scanner;

public class Metod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();
        isaret_Bul(number);
    }
    public static void isaret_Bul(int x) {
        if (x > 0) {
            System.out.println("Pozitiftir");
        }
        else if (x < 0) {
            System.out.println("Negatiftir");
        }
        else {
            System.out.println("Sıfırdır");
        }
    }
}
