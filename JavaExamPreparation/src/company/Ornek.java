//Klavyeden girilen string içindeki boşlukları bulup bunların kaçıncı karakterler olduğunu ekrana yazan programı yapınız.
package company;
import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     char a = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                System.out.println("Boşluk : " + i + " inci ");
            }
        }
    }
}
