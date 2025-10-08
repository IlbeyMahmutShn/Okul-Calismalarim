//10 karakter uzunluğunda aralarında boşluk olmak şartıyla 100 defayukarıdan aşşağıya doğru karakterleri hareket ettiren java programını yazınız.
package company;
import java.util.Random;

public class Metod15 {
    public static void main(String[] args) {
        kaydir();
    }
    public static void kaydir() {
        Random rondom = new Random();
        char c [] = {'a','b','c','d','1','2','3','4'};
        String s = " ";
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                s += c[(int) (8 * Math.random())];
            }
            System.out.println(s);
            s += "\n";
        }
    }
}
