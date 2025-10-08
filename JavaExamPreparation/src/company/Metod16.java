//Kendisine parametre olarak gelen tek boyutlu String dizisi içindeki en uzun karaktere sahip Stringi bulup geri dönderen java programını yazınız.
package company;

public class Metod16 {
    public static void main(String[] args) {
        String s [] = {"Mahmut" , "YılmazAlp","Abdulrezzak"};
        String sonuc = en_Uzun(s);
        System.out.println(sonuc);
    }
    public static String en_Uzun(String s []) {
        int enb = s[0].length();
        String es = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > enb) {
                enb = s[i].length();
                es = s[i];
            }
        }
        return es;
    }
}
