//Klavyeden girilen Strig içinde kaç tane ali ifadesinin geçtiğini bulan java programını yapınız.
//Aranan karakter sayısının bir eksiğine kadar dizi üzerinde arama işlemi yapılması yeterlidir.
package company;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < s.length()-2;) {
            if (s.charAt(i) == 'a' && s.charAt(i+1) == 'l' && s.charAt(i+2) == 'i') {
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
