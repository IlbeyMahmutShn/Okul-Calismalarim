package company;

import javax.swing.*;
import java.awt.*;

public class Main3 extends JPanel{
    public void paint(Graphics g) {
        g.drawOval(80 , 80 , 40 , 40);
        g.drawOval(80 , 200 , 40 , 40);
        g.drawLine(80 , 100 , 80 ,220);
        g.drawLine(120 , 100 , 120 ,220);



    }
    public static void main(String[] args) {
        Main3 m = new Main3();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600 , 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}