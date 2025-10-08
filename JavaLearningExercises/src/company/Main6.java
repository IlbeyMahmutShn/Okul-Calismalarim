//String sorusu
package company;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        sekillendirme(s);
    }
    public static void sekillendirme(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i+1; j++) {
                if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                    System.out.print(s.charAt(i) + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
