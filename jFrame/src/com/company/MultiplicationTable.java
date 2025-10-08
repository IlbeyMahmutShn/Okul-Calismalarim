package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {
    private JPanel panel;
    private JLabel[] numberLabels = new JLabel[10];
    private JLabel[] resultLabels = new JLabel[10];

    public MultiplicationTable() {
        setTitle("Çarpım Tablosu");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(11, 3, 5, 5));

        // İlk satır başlık
        panel.add(new JLabel("Sayı", SwingConstants.CENTER));
        panel.add(new JLabel("Çarpan", SwingConstants.CENTER));
        panel.add(new JLabel("Sonuç", SwingConstants.CENTER));

        // Sayı butonları
        for (int i = 1; i <= 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            int num = i;
            btn.addActionListener(e -> showMultiplication(num));
            panel.add(btn);
            panel.add(new JLabel("")); // boşluk
            panel.add(new JLabel("")); // boşluk
        }

        // Sonuçları gösterecek alanlar
        for (int i = 0; i < 10; i++) {
            numberLabels[i] = new JLabel("", SwingConstants.CENTER);
            resultLabels[i] = new JLabel("", SwingConstants.CENTER);
            panel.add(numberLabels[i]);
            panel.add(new JLabel(i + 1 + "", SwingConstants.CENTER));
            panel.add(resultLabels[i]);
        }

        add(panel);
    }

    private void showMultiplication(int number) {
        for (int i = 0; i < 10; i++) {
            numberLabels[i].setText(number + "");
            resultLabels[i].setText(number * (i + 1) + "");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MultiplicationTable().setVisible(true);
        });
    }
}
