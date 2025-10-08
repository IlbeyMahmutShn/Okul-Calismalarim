//Klavyeden girilen sayılar içinde daima en büyük sayı ekrana yazan girilen sayı - 9999 ise duran java programını yazınız.
package company;
import java.util.Scanner;

public class Metod4 {
    public static void main(String[] args) {
        enb_Bul();
    }
    public static void enb_Bul() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int counter = 1;
        System.out.println("Lütfen sayıyı giriniz");
        int enb = scanner.nextInt();
        if (enb == -9999) {
            System.exit(1);
        }
        for (;;) {
            System.out.println("Lütfen sayıyı giriniz");
            number = scanner.nextInt();
            counter++;
            if (number == -9999) {
                break;
            }
            if (number > enb) {
                enb = number;
                System.out.println("En büyük sayı : " + enb + " " + counter);
            }
            else {
                System.out.println("En büyük sayı : " + enb + " " + counter);
            }
        }
    }
}
