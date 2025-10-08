package company;

public class Main24 {
    public static void main(String[] args) {
        int total = 0;
        int fak = 1 , us = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i + 1; j++) {
                fak *= j;
            }
            for (int k = 1; k <= fak; k++) {
                us *= i + 1;
            }
            total += us;
            fak = 1;
            us = 1;
        }
        System.out.println(total);
    }
}
