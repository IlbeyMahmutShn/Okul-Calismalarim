package company;

public class Main22 {
    public static void main(String[] args) {
        int us = 1;
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                us *= i + 1;
            }
            total += us;
            us = 1;
        }
        System.out.println(total);
    }
}
