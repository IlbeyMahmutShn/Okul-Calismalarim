package company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s ;
        char [] a = new char[20];
        char [] b = new char[20];
        int [] c = new int[20];
        int k = 0 , l= 0 , m = 0;

        for (int i = 0; i < 20; i++) {
            s = scanner.next().charAt(0);
            if (s >= '0' && s <= '9') {
                c [k] = s;
                k++;
            }
            if (s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z') {
                b [l] = s;
                l++;
            }
            else {
                a [m] = s;
                m++;

            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(a[j] + b [j] + c[j]);
        }
    }
}
