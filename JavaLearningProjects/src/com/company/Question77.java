package com.company;

import javax.swing.*;
import java.awt.*;

public class Question77 extends JPanel {

    public void paint(Graphics g){
        int x = 100;
        int y = 100;
        for (int i = 0; i < 3; i++) {
            g.drawLine(x , 100 , x +20 , 100);
            g.drawLine(x+20 , 100 , x+20 , 80);
            g.drawLine(x+20 , 80 , x+40 , 80);
            g.drawLine(x+40 , y - 20 , x+40 , 100);
            x+=40;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Question77 m = new Question77();

        f.add(m);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
