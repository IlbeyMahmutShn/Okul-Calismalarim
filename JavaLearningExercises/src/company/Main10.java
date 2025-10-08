//Program içerisinde girilmiş olan tek boyutlu sayısal dizi içerisindeki
//En büyük ilk sayıyı bulan
//En büyük son sayıyı bulan java programını yazınız.
package company;

public class Main10 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,5,4,3,2,1};
        int enb = a[0];
        int yer = 0;
        for (int i = 0; i < a.length; i++) {
            if (enb < a[i]) {
                enb = a[i];
                yer =i;
            }
        }
        System.out.println(enb + " " + yer);
    }
}