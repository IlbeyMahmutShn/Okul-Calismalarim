//Klavyeden girilen aralarında boşluk olan stringi parçalayıp kelimeleri ekrana yazan java programını yapınız.
//b programı method ile yapınız.
package company;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner scanenr = new Scanner(System.in);
        String s = scanenr.next();
        String temp = " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            }
            System.out.print(temp);
            temp = " ";
        }

    }
}
