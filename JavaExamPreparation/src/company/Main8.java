//Klavyeden girilen iki boyutlu matrisi okuyup ekrana matris şeklinde yazdıran java programını yazınız.
package company;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a [][] = new int[2][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a [i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
