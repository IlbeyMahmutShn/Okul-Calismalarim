//Kendisine parametre olarak gelen 2 Stringi birleştiren
//Tek bir string haline gertiren java programını yazınız.
//Birleştirilmiş stringi ters çeviren java programını yazınız.
package company;

public class Metod5 {
    public static void main(String[] args) {
        String a = "Mahmut";
        String b = "Yılmaz";
        birlestir(a , b);
    }
    public static void birlestir(String a , String b) {
        String s = a + b;
        System.out.println(s);
        ters(s);
    }
    public static void ters(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
