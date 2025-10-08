package com.company;

public class Question60 extends Thread {
    public static final int maks_asal = 1000000;
    public static final int on_sn = 1000000;
    public boolean bittimi = false;

    @Override
    public void run() {
        int [] asallar = new int[maks_asal];
        int sayi = 0;

        for (int index = 2; index < maks_asal; index++) {
            if (bittimi) return;
            boolean asal = true;

            for (int jindex = 2; jindex < index; jindex++) {
                if (index % jindex == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                asallar [sayi++] = index;
                System.out.println("Bulunan asal sayı : " + index);
            }
        }
    }
    public static void main(String[] args) {
        Question60 M = new Question60();
        M.start();

        try {
            Thread.sleep(on_sn);
        }
        catch (Exception e) {
            M.bittimi = true;
        }
    }
}