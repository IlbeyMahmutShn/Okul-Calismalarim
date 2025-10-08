package company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends Canvas implements MouseMotionListener , MouseListener {
    int sx , sy;
    int ex , ey;

    public Mouse() {
        this.sx = 0;
        this.sy = 0;
        this.ex = 0;
        this.ey = 0;
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        g.drawLine(sx , sy , ex , ey);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        ex = e.getX();
        ey = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sx = e.getX();
        sy = e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ex = e.getX();
        ey = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ex = e.getX();
        ey = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
