package company;
import javax.swing.*;
import java.awt.*;

public class Main6 extends JPanel {
    double toplam;
    public void init() {
        double n , n1;
        String number , number1;
        System.out.println("Lütfen bir sayı giriniz");
        number = JOptionPane.showInputDialog("Birinci sayıyı giriniz");
        number1 = JOptionPane.showInputDialog("İkinici sayıyı giriniz");
        n = Double.parseDouble(number);
        n1 = Double.parseDouble(number1);
        toplam = n + n1;
    }
    public void paint(Graphics g) {
        g.drawRect(30 , 30 , 100 , 40);
        g.drawString("toplam =" +toplam , 50,50);

    }
    public static void main(String[] args) {
        Main6 m = new Main6();
        JFrame f = new JFrame();
        m.init();
        f.add(m);
        f.setSize(600 , 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
