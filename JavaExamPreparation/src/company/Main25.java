package company;

public class Main25 {
    public static void main(String[] args) {
        Double total = 0.0 , us2 = 1.0;
        int fak = 1 , us = 1;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i + 1; j++) {
                fak *= j;
            }
            for (int k = 1; k <= i + 1; k++) {
                us *= i + 1;
            }
            for (int l = 1; l <= i; l++) {
                us2 *= (double) fak / (double) us;
            }
            total += us2;
            fak = 1;  us = 1;  us2 = 1.0;
        }
        System.out.println(total);
    }
}
