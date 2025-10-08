package company;
import javax.swing.*;
import java.awt.*;

public class Kup extends JPanel {
    int x , y , h , w;
    Point[] kup1Points;
    Point[] kup2Points;

    public Kup(int x , int y , int w , int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        kup1Points = getKup1Points();
        kup2Points = getKup2Points();
    }

    public Point [] getKup1Points() {
        Point[] points = new Point[4];
        points[0] =new Point(x , y);
        points[1] =new Point(x + w , y);
        points[2] =new Point(x , y + w);
        points[3] =new Point(x + w , y + w);

        return points;
    }
    public Point [] getKup2Points() {
        int x1 = x + h;
        int y1 = y + h;
        Point[] points = new Point[4];
        points[0] =new Point(x1 , y1);
        points[1] =new Point(x1 + w , y1);
        points[2] =new Point(x1 , y1 + w);
        points[3] =new Point(x1 + w , y1 + w);

        return points;

    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(x , y , w , h);
        g.drawRect(x + w , y + h , w , h);
        for (int index = 0; index < 4; index++) {
            g.drawLine(kup1Points[index].x , kup1Points[index].y , kup2Points[index].x , kup2Points[index].y);
        }


    }
    public static void main(String[] args) {
        Kup k = new Kup (100 , 100 ,200 ,75);
        JFrame f = new JFrame();
        f.add(k);
        f.setSize(600 , 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
