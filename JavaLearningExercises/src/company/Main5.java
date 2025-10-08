//Sayısal işlem
package company;

public class Main5 {
    public static void main(String[] args) {
        int fak = 1; int us = 1; int fak2 = 1;
        int total = 0;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < (i + 1); j++) {
                fak *= i;
            }
            for (int k = 1; k < fak; k++) {
                us *= (i + 1);
            }
            for (int l = 1; l < i; i++) {
                fak2 *= i;
            }
            total = us / fak2;
        }
        System.out.println(total);
    }
}
