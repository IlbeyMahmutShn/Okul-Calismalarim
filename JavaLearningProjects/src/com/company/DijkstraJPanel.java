package com.company;

import javax.swing.*;
import java.awt.*;

public class DijkstraJPanel extends Canvas {

    public static void DijkstraJPanel(int[][] graph, int kok) {
        int sayac = graph.length;
        boolean[] gezilenDugum = new boolean[sayac];
        int[] mesafe = new int[sayac];
        for (int i = 0; i < sayac; i++) {
            gezilenDugum[i] = false;
            mesafe[i] = Integer.MAX_VALUE;
        }

        // Öz döngü mesafesi sıfırdır
        mesafe[kok] = 0;
        for (int i = 0; i < sayac; i++) {

            // Komşu tepe noktası ile kaynak tepe noktası arasındaki mesafeyi güncelleyin
            int u = minMesafe(mesafe, gezilenDugum);
            gezilenDugum[u] = true;

            // Tüm komşu köşe mesafelerini güncelle
            for (int v = 0; v < sayac; v++) {
                if (!gezilenDugum[v] && graph[u][v] != 0 && (mesafe[u] + graph[u][v] < mesafe[v])) {
                    mesafe[v] = mesafe[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < mesafe.length; i++) {
            Thread(2000);
            System.out.println(String.format("Uzaklık %s ile %s ise %s", kok, i, mesafe[i]));
        }

    }

    //Minimum mesafeyi bulma
    private static int minMesafe(int[] mesafe, boolean[] gezilenDugum) {
        int minMesafe = Integer.MAX_VALUE;
        int minMesafeDugum = -1;
        for (int i = 0; i < mesafe.length; i++) {
            if (!gezilenDugum[i] && mesafe[i] < minMesafe) {
                minMesafe = mesafe[i];
                minMesafeDugum = i;
            }
        }
        return minMesafeDugum;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawOval(50 , 50 , 75 , 75);
        g.drawString("A" ,84 ,90);

        g.setColor(Color.black);
        g.drawOval(300 , 75 , 75 , 75);
        g.drawString("B" ,334 ,115);

        g.setColor(Color.black);
        g.drawOval(120 , 175 , 75 , 75);
        g.drawString("C" ,154 ,215);

        g.setColor(Color.black);
        g.drawOval(0 , 310 , 75 , 75);
        g.drawString("D" ,34 ,352);

        g.setColor(Color.black);
        g.drawOval(460 , 440 , 75 , 75);
        g.drawString("E" ,496 ,485);

        g.setColor(Color.black);
        g.drawOval(350 , 310 , 75 , 75);
        g.drawString("F" ,384 ,355);


        g.drawLine(125, 86, 300, 110);
        g.drawString("2" ,210 ,90);
        g.drawLine(110, 120, 150, 175);
        g.drawString("1" ,135 ,145);
        g.drawLine(364, 134, 495, 440);
        g.drawString("2" ,435 ,285);
        g.drawLine(345, 148, 384, 310);
        g.drawString("5" ,370 ,228);
        g.drawLine(180, 241, 350, 344);
        g.drawString("2" ,245 ,275);
        g.drawLine(134, 240, 65, 320);
        g.drawString("1" ,110 ,300);
        g.drawLine(72, 362, 462, 462);
        g.drawString("7" ,250 ,440);
        g.drawLine(73, 352, 350, 355);
        g.drawString("5" ,210 ,370);



        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(50, 50, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(50, 50, 75, 75);

        Thread(1000);
        g.setColor(Color.blue);
        g.drawOval(300, 75, 75, 75);

        Thread(1000);
        g.setColor(Color.blue);
        g.drawOval(120, 175, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(50, 50, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(300, 75, 75, 75);

        Thread(1000);
        g.setColor(Color.green);
        g.drawOval(460, 440, 75, 75);

        Thread(1000);
        g.setColor(Color.green);
        g.drawOval(350, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(300, 75, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(120, 175, 75, 75);

        Thread(1000);
        g.setColor(Color.orange);
        g.drawOval(0, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.orange);
        g.drawOval(350, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(120, 175, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(0, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(0, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(350, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(350, 310, 75, 75);

        Thread(1000);
        g.setColor(Color.red);
        g.drawOval(460, 440, 75, 75);

        Thread(1000);
        g.setColor(Color.black);
        g.drawOval(460, 440, 75, 75);

    }
    private static void Thread(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Dijkstra");
        f.getContentPane().add(new DijkstraJPanel());
        f.setSize(1000,1000);
        f.setVisible(true);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int graph[][] = new int[][] { { 0, 2, 1, 0, 0, 0 }, { 2, 0, 0, 2, 5, 0 }, { 1, 0, 0, 0, 2, 1 },
                { 0, 2, 0, 0, 0, 7 }, { 0, 5, 2, 0, 0, 5 }, { 0, 0, 1, 7, 5, 0 } };
        DijkstraJPanel T = new DijkstraJPanel();
        T.DijkstraJPanel(graph, 0);
    }
}