package company;

public class Main29 {
    public static void main(String[] args) {
        int total = 0;
        int carp = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                total += i + j;
            }
            carp *= total;
            total = 0;
        }
        System.out.println(carp);
    }
}