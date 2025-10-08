//Verilen 2 boyutlu String matrisi içindeki sayıları bulup ekrana yazan java programını yazınız.
package company;

public class VizeLesson3 {
    public static void main(String[] args) {
        String s[][] = {{"Ali" , "2Mehmet"},{"1Ali" , "Mehmet"}};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                for (int k = 0; k < s[i][j].length(); k++) {
                    if (s[i][j].charAt(k) >= '1' && s[i][j].charAt(k) <= '9') {
                        System.out.print(s[i][j].charAt(k) + " ");
                    }
                }
            }
        }
    }
}
