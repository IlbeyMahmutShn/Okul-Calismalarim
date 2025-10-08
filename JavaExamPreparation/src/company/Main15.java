//1 , 3 , 5 , 7 , 9 , 9 , 11 , 13 , 15 , 18 , 18 , 19... ilk 30 elemanın toplamını hesaplayan java programını yazınız.
package company;

public class Main15 {
    public static void main(String[] args) {
        int sayac = 0;
        int total = 0;

        for (int i = 1;; i++) {
            if (sayac >= 30) {
                System.out.println(total);
                break;
            }
            if (i % 2 == 1) {
                System.out.println(i);
                total += i;
                sayac++;
            }
            if (i % 9 == 0) {
                System.out.println(i);
                total += i;
                sayac++;
            }
        }
    }
}
