//Kendisine parametre olarak gelen 2 boyutlu String dizisi içindeki en uzun karaktere sahip olan Stringi ve yerini (satır , sütun) geri döndüren methodu yazınız.
package com.company;


public class Question35 {
    public static void main(String[] args) {
        String [][] word = {{"Bilgisayar","absjdjaskd"},{"Bilgisasdasdasdayar","absjdjaskd"}};
        String [] sonuc = mahmut(word);
        System.out.println(sonuc[0]);
        System.out.println(sonuc[1]);
        System.out.println(sonuc[2]);



        /*
        String [][] word = {{"Bilgisayar"},{"Taner"}};
        String sonuc = biggest_word(word);
        for (int index = 0; index < sonuc.length; index++) {
            System.out.println(sonuc[index]);
        }
         */
    }
    public static String[] mahmut(String[][] str){
    // kendisi satır sütun
        String[] geri=new String[3];

        String eb=str[0][0];
        //int eb_length=str[0][0].length();
        int satir=0;
        int sütun=0;

        for(int i=0;i<str.length-1;i++){
            for(int j=0;i<str[0].length;j++){
                if(eb.length() < str[i][j].length()){
                    eb=str[i][j];
                    satir=i;
                    sütun=j;
                }
            }
        }
        geri[0]=eb;
        geri[1] = String.valueOf(satir);
        geri[2] = String.valueOf(sütun);

        return geri;
    }


    /*
    public static String biggest_word(String [][] a) {
        String enb_word = a[0][0];
        for (int jindex = 0; jindex < a.length; jindex++) {
            for (int kindex = 0; kindex < a[0].length; jindex++) {
                if (enb_word.length() < a[jindex][kindex].length()) {
                    enb_word = a[jindex][kindex];
                }
            }
        }
    }
*/

}

