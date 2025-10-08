//Aşşadaki seririn ilk 20 elemanının toplamını bulan java programını yazınız.
//1 , 5 , 9 , 13 ...
package company;

public class Main12 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0 , a = 1; i < 20; i++ , a += 4) {
            total += a;
        }
        System.out.println(total);
    }
}
