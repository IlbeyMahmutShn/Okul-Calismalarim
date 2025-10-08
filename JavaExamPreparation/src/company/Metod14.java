//Klavyeden girilen karakterleri yukarıdan aşşağıya doğru üçgen şeklinde yazan java programını yapınız.
package company;
import java.util.Scanner;

public class Metod14 {
    public static void main(String[] args) {
        ucgen();
    }
    public static void ucgen() {
        Scanner scanner = new Scanner(System.in);
        String s = " ";
        for (int i = 0; i < 10; i++) {
            s += scanner.nextLine().charAt(0);
            System.out.println(s);
        }
    }
}
