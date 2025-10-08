package com.company;
import com.sun.jdi.event.ExceptionEvent;

import javax.swing.*;
import java.awt.*;

public class Question76 extends Canvas implements Runnable {
    Question76() {
        Thread t = new Thread(this);
        t.start();
    }
    int x = 200 , y = 200;
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(200 , 200 , 350 , 200);
        g.setColor(Color.red);
        g.drawLine(200 , 200 , 200 , 50);
        g.setColor(Color.blue);
        g.fillOval(x-10 , y-10 , 20 , 20);
        g.drawLine(200,200,350,50);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                x += 10;
                y -= 10;
                Thread.sleep(500);
                repaint();
            }
        }
        catch(Exception e) {

        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("adam");
        Question76 m = new Question76();

        f.add(m);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
