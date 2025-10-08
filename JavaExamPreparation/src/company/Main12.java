//99 , 94 , 89 , 84 ... şeklinde girilen
//ilk 10 eleman toplamı
//405. elamanı bulan java programını yazınız.
package company;

public class Main12 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0 , a = 99; i < 10; i++ , a -= 5) {
            total += a;
        }
        System.out.println(total);
    }
}