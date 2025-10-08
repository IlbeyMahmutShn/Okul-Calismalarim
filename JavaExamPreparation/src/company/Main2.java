//Klavyeden girilen adı , soyadı , no yazdıran java programını yazınız.
package company;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String ad = scanner.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyad = scanner.nextLine();
        System.out.println("Lütfen öğrenci numaranızı giriniz");
        int no = scanner.nextInt();

        System.out.println(ad + " " + soyad + " " + no);
    }
}
