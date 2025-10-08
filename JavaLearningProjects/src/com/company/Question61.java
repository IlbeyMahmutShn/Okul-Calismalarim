package com.company;
import javax.swing.*;
import java.awt.*;

public class Question61 extends JPanel implements Runnable {
    private int dizi [] = new int[20];
    public Question61() {
        new Thread(Question61.this).start();
        for (int index = 0; index < dizi.length; index++) {
            dizi [index] = (int) (Math.random()*100);
        }
    }

    public void paint(Graphics g) {
        int y = 10;
        for (int i = 0; i < dizi.length; i++) {
            g.drawLine(0 , y , dizi[i] , y);
            y += 10;
        }
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < dizi.length; i++) {
                for (int j = i+1; j < dizi.length; j++) {
                    if (dizi[j] < dizi[i]) {
                        int a = dizi[i];
                        dizi [i] =dizi[j];
                        dizi [j] = a;
                    }
                    repaint();

                    try {
                        Thread.sleep(50);

                    }
                    catch (Exception e) {

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Question61 s = new Question61();
        f.add(s);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
