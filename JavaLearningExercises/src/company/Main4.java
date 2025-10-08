package company;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        ucgen_Bul();
    }
    public static void ucgen_Bul() {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz");
        int x = scanner.nextInt();
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz");
        int y = scanner.nextInt();
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz");
        int z = scanner.nextInt();
        if (x > 0 && y > 0 && z > 0) {
            if (x > y) {
                if ((x + y) > z && (x - y) < z) {
                    a = true;
                }
                else {
                    a = false;
                }
            } else {
                if ((x + y) > z && (y - x) < z) {
                    a = true;
                }
                else {
                    a = false;
                }
            }
        }
        else {
            System.out.println("Uzunluk pozitif olmalıdır");
        }
        if (a == true) {
            System.out.println("üçgen oluşturulmaktadır");
        }
        else {
            System.out.println("Üçgen oluşturulamaz");
        }
    }
}
