package company;

public class Main9 {
    public static void main(String[] args) {
        String a [][] = {{"asda2sd","dasd3"},{"sdasd1sdfsdg","sadsad2"}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < a[i][j].length(); k++) {
                    if (a[i][j].charAt(k) >= '1' && a[i][j].charAt(k) <= '9') {
                        System.out.println(a[i][j].charAt(k) + " ");
                    }
                }
            }
        }
    }
}
