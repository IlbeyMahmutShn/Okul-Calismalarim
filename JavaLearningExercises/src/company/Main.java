package company;

public class Main {

    public static void main(String[] args) {
        String s = "Ahmet Ç   ınar";
        char c = ' ';
        bosluk_Bul(s , c);

    }
    public static int bosluk_Bul(String s , char a) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
