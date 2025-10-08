//Klavyeden rastgele sayılar giriliyor bu sayıları aşşağıdaki gibi yazan java programını yazınız.
package company;
import java.util.Scanner;

public class Metod13 {
    public static void main(String[] args) {
        ucgen();
    }
    public static void ucgen() {
        Scanner scanner = new Scanner(System.in);
        String s = " ";

        for (int i = 0; i < 5; i++) {
            s += " " + Integer.toString(scanner.nextInt());
            System.out.println(s);
        }
    }
}
