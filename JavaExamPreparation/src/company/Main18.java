//1 , 3 , 4 , 5 , 5 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 15 , 16... ilk 40 elemanın toplamını hesaplayan java programını yazınız.
package company;

public class Main18 {
    public static void main(String[] args) {
        int total = 0;
        int k = 0 , l = 0 , m = 0;


        for (int i = 1;; i++) {
            if (k + l + m >= 40) {
                System.out.println(total);
                break;
            }
            if (i % 2 == 1) {
                total += i;
                k++;
            }
            if (i % 4 == 0) {
                total += i;
                l++;
            }
            if (i % 5 == 0) {
                total += i;
                m++;
            }
        }
    }
}
