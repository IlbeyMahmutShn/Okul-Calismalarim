//Klavyeden girilen sayının işaretini bulan java programını yazınız.
package company;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Pozitiftir");
        }
        else if (number < 0) {
            System.out.println("Negatiftir");
        }
        else {
            System.out.println("Sıfırdır");
        }
    }
}
