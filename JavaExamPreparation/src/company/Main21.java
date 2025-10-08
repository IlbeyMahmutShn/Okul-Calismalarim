package company;

public class Main21 {
    public static void main(String[] args) {
        int fak = 1;
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + 3; j++) {
                fak *= j;
            }
            total += fak;
            fak = 1;
        }
        System.out.println(total);
    }
}