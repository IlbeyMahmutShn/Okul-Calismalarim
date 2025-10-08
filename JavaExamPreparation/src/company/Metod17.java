//Yerinide bulan!!!
package company;

public class Metod17 {
    public static void main(String[] args) {
        String s [] = {"Mahmut" , "YılmazAlp","Abdulrezzak"};
        String sonuc [] = en_Uzun(s);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
    public static String [] en_Uzun(String s []) {
        int enb = s[0].length();
        int yer = 0;
        String es = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > enb) {
                enb = s[i].length();
                es = s[i];
                yer = i;
            }
        }
        String a [] = new String[2];
        a[0] = es;
        a[1] = String.valueOf(yer);
        return a;
    }
}