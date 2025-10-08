//İki boyutlu dizinin birim matris olup olmadığını kontrol eden java programını yazınız.
package company;

public class VizeLesson2 {
    public static void main(String[] args) {
        int a [][] = {{1 , 0},
                      {0 , 1}};
        boolean b = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a.length == a[0].length) {
                    if (i == j) {
                        if (a[i][j] == 1) {
                            b = true;
                        }
                        else {
                            b = false;
                            break;
                        }
                    }
                }
            }
        }
        if (b) {
            System.out.println("Birim matristir");
        }
        else {
            System.out.println("Birim matris değildir");
        }
    }
}
