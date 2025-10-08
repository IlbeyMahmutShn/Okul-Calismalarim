//İki sayının toplamını yapan java programını yazınız.
package company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Lütfen birinci sayıyı giriniz");
        int number = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int number2 = scanner.nextInt();

        total += number + number2;
        System.out.println("Sonuc : " + total);
    }
}
