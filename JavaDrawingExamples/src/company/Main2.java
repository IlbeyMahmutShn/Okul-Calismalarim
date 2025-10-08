package company;

import javax.swing.*;
import java.awt.*;

public class Main2 extends JPanel{
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            for (int  j = 0; j < 4; j++) {
                g.setColor(Color.red);
                g.fillOval(x , y , 100 , 100);
                x += 100;
            }
            x = 0;
            y += 100;

        }

    }
    public static void main(String[] args) {
        Main m = new Main();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600 , 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}