package company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Ali.txt");
        Scanner k = new Scanner(f);
        bul(k);
    }
    public static void bul(Scanner k) {
        String s = " ";

        while (k.hasNextLine()) {
            String [] a = s.split(" ");
            enb_bul(a);
        }
    }
    public static void enb_bul(String [] a) {
     int max = Integer.valueOf(a[2]);
     String ad = " ";

         for (int i = 2; i < a.length; i+=3) {
             if (max < Integer.valueOf(a [i])) {
                 max = Integer.valueOf(a [i]);
                 ad = a[i -2];
             }
         }
        System.out.println("Enb büyük not : " + max + " " + "İsmi : " + ad);
         ort_bul(a);
    }
    public static void ort_bul(String [] a) {
        int total = 0;
        int counter = 0;
        int ort = 0;

        for (int i = 2; i < a.length; i+=3) {
            total += Integer.valueOf(a[i]);
            counter++;
        }
        ort = total / counter;

        for (int i = 2; i < a.length; i+=3) {
            if (Integer.valueOf(a[i]) < ort) {
                System.out.println("Not ortalaması : " + ort + " " + "İsmi : " + a[i-2]) ;
            }
        }
        yaz(a);
    }
    public static void yaz(String [] a) {
        String [] b = new String[a.length/3];
        int counter = 0;

        for (int i = 0; i < a.length; i+=3) {
            b [counter] = a[i];
            counter++;
        }
        for (int i = 0; i < b.length; i++) {
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));
        }
    }
}
