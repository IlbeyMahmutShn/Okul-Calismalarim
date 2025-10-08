package company;

public class Main3 {
    public static void main(String[] args) {
        sayi_Bul();
    }
    public static void sayi_Bul() {
        int a , b , c , total = 0;
        for (int i = 1; i < 1000; i++) {
            a = i % 10;
            b = (i % 100) / 10;
            c = i / 100;
            total += a*a*a+b*b*b+c*c*c;
            if (total == i) {
                System.out.println(i + "  Süper sayıdır");
            }
            total = 0;
        }
    }
}
