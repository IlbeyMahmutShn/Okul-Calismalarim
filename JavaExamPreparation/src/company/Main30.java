//Klavyeden girilen ifadenin sayı , rakam olup olmadığını bulan java programını yazınız.
package company;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean a = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                a = true;
                break;
            }
            else {
                a = false;
            }
        }
        if (a) {
            System.out.println("İfadede rakam vardır");
        }
        else {
            System.out.println("İfadede rakam yoktur");
        }
    }
}
