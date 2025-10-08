package com.company;

public class Question73 implements Runnable {
    public static void main(String[] args) {
        Thread yavas = new Thread();

    }
    @Override
    public void run() {
        try {
            System.out.println("merhaba");
            Thread.sleep(1000 * 5);
            System.out.println("merhaba");
        }
        catch (Exception e) {

        }
    }
}
