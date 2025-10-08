//b klavyeden girilen n sayısına kadar örüntüyü tamamlayan java programını yazınız.
package company;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("n");
            }
            System.out.println(" ");
        }
    }
}
