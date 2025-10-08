package company;

public class Main26 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                total += i + j;
            }
        }
        System.out.println(total);
    }
}
