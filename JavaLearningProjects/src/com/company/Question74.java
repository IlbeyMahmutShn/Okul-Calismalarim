package com.company;

public class Question74 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}