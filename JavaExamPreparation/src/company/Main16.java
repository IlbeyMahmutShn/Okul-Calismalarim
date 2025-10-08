//Aşşadaki örüntüyü ekrana yazan java programını yazınız.
//AAAA
//AAA
//AA
//A
package company;

public class Main16 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("A");
            }
            System.out.println(" ");
        }
    }
}
