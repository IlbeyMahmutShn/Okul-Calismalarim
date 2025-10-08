//Klavyeden girilen sayı tek ise diziye aktaran ve sayısı 10 ise duran java programını yazınız.
package company;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int single [] = new int[10];
        int number;

        for (int i = 0;;) {
            System.out.println("Lütfen bir sayı giriniz");
            number = scanner.nextInt();
            if (number % 2 == 1) {
                single [i] = number;
            }
            if (i >= 9) {
                break;
            }
            i++;
        }
    }
}
