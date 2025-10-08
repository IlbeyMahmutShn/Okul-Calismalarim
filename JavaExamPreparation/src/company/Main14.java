//1 , 2 , 4 , 4 , 6 , 7 , 8 , 10 ,10 , 11... ilk 50 eleman toplamını hesaplayan java programını yazınız.
package company;

public class Main14 {
    public static void main(String[] args) {
        int total = 0;
        int sayac = 0;
        int sayac2 = 0;
        for (int i = 0 , a = 1 , b = 2;; i++ , a += 3 , b += 2 , sayac++ ,sayac2++) {
            if (sayac + sayac2 >= 50) {
                System.out.println(total);
                break;
            }
            total += a + b;
        }
    }
}
