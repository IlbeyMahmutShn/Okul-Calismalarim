//Klavyeden girilen 20 tane ifade sınıflandırılmak isteniyor yani girilen harfler , rakamlar , özel karakterler ayrı ayrı tutulacaktır. Bu işlemi yapan java programını yazınız.
package company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a [] = new char[20];
        int b [] = new int[20];
        String c [] = new String[20];
        char s;
        int k = 0 , l = 0 , m = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Lütfen bir karakter giriniz");
            s = scanner.next().charAt(0);
            if (s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z') {
                a [k] = s;
                k++;
            }
            else if (s >= '1' && s <= '9') {
                b [l] = s;
            }
            else {
                c [m] = String.valueOf(s);
                m++;
            }
        }
    }
}
