package company;

public class Main27 {
    public static void main(String[] args) {
        int carp = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                carp *= i + j;
            }
        }
        System.out.println(carp);
    }
}
