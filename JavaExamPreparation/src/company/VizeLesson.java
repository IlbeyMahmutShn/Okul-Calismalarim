//İki boyutlu dizi kendisine transpozimse ekrana yazan java kodunu yazınız.
package company;
import java.util.Scanner;

public class VizeLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a [][] = new int[2][2];
        boolean b = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a [i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == a[j][i]) {
                    b = true;
                }
                else {
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println("Kendisine transpozimdir");
        }
        else {
            System.out.println("Kendisine transpozim değildir");
        }
    }
}
