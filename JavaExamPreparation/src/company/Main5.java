//Klavyeden girilen 10 tane sayıyı diziye aktaran java programını yazınız.
package company;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number [] = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Lütfen bir sayı giriniz");
            number [i] = scanner.nextInt();
        }
    }
}
