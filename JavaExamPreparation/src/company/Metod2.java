//Klavyeden girilen 10 tane sayının işaretini bulan java programını yazınız.
package company;
import java.util.Scanner;

public class Metod2 {
    public static void main(String[] args) {
        isaret_Bul();
    }
    public static void isaret_Bul() {
        Scanner scanner = new Scanner(System.in);
        int number;

        for (int i = 0; i < 10; i++) {
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number + " Pozitiftir");
            }
            else if (number < 0) {
                System.out.println(number + " Negatiftir");
            }
            else {
                System.out.println("Sıfırdır");
            }
        }
    }
}
