//Girilen string içinde yan yana boşluk sayısını bulan ekrana yazan programı yapınız.
package company;
import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char a = ' ';
        int counter = 0;

        for (int i = 0; i < s.length()-1;) {
            if (s.charAt(i) == a && s.charAt(i + 1) == a) {
                i += 2;
                counter++;
            }
            else {
                i++;
            }
        }
        System.out.println(counter);
    }
}