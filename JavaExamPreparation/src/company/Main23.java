package company;

public class Main23 {
    public static void main(String[] args) {
        double total = 0.0;
        int us = 1 , fak = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                fak *= j;
            }
            for (int k = 1; k <= i; k++) {
                us *= i + 1;
            }
            total += (double) fak / (double) us;
            fak = 1;
            us = 1;
        }
        System.out.println(total);
    }
}
