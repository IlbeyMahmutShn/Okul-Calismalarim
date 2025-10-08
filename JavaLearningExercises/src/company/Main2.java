package company;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        sayi_Al();
    }

    public static void sayi_Al() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int x = scanner.nextInt();
        if (x > 99 && x < 1000) {
            super_Sayi_Bul(x);
        }
        else {
            System.out.println("girilen sayı 3 basamaklı değildir");
        }
    }
    public static void super_Sayi_Bul(int x) {
        int a , b , c;
        int total = 0;
           a = x % 10;
           b = (x / 10) % 10;
           c = x / 100;
           total += Math.pow(a , 3) + Math.pow(b , 3) + Math.pow(c , 3);
           if (total == x) {
               System.out.println(x + " Süper sayıdır");
           }
           else {
               System.out.println(x + " Süper sayı değildir");
           }
    }
}