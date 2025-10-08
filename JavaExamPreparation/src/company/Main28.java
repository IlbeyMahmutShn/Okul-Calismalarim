package company;

public class Main28 {
    public static void main(String[] args) {
        int total = 0;
        int carp = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                carp *= i + j;
            }
            total += carp;
            carp = 1;
        }
        System.out.println(total);
    }
}
