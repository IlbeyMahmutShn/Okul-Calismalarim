//Klavyeden girilen harfleri harf dizisine atan java kodunu yazınız.
package company;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s [] = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Lütfen bir harf giriniz");
            s [i] = scanner.nextLine().charAt(0);
        }
    }
}
