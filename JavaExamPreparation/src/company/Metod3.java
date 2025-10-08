//Klavyeden girilen bir tek String içindeki büyük harf , küçük harf , rakam ve özel karakterleri bulup ekrana yazan java programını yazınız.
package company;
import java.util.Scanner;

public class Metod3 {
    public static void main(String[] args) {
        karakter_Yaz();
    }
    public static void karakter_Yaz() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                System.out.println(s.charAt(i) + " Küçük harftir");
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                System.out.println(s.charAt(i) + " Büyük harftir");
            }
            else if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                System.out.println(s.charAt(i) + " Rakamdır");
            }
            else {
                System.out.println(s.charAt(i) + " Özel karakterdir");
            }
        }
    }
}
