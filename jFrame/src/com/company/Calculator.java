package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private String firstNumber = "";
    private String secondNumber = "";
    private String operator = "";
    private JLabel screen;

    public Calculator() {
        // Temel pencere ayarları
        setTitle("Hesap Makinesi");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Ekran
        screen = new JLabel("", SwingConstants.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 24));
        screen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Buton paneli
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(btn);
            btn.addActionListener(new ButtonClickListener());
        }

        // Ana panel
        setLayout(new BorderLayout(10, 10));
        add(screen, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                if (operator.isEmpty()) {
                    firstNumber += command;
                    screen.setText(firstNumber);
                } else {
                    secondNumber += command;
                    screen.setText(firstNumber + " " + operator + " " + secondNumber);
                }
            } else if (command.matches("[/*\\-+]")) {
                if (!firstNumber.isEmpty()) {
                    operator = command;
                    screen.setText(firstNumber + " " + operator);
                }
            } else if (command.equals("=")) {
                calculate();
            } else if (command.equals("C")) {
                firstNumber = "";
                secondNumber = "";
                operator = "";
                screen.setText("");
            }
        }
    }

    private void calculate() {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            int result = 0;

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 == 0) throw new ArithmeticException("Sıfıra bölünme hatası!");
                    result = num1 / num2;
                    break;
            }

            screen.setText(firstNumber + " " + operator + " " + secondNumber + " = " + result);

            // Yeni işlem için sıfırlama
            firstNumber = String.valueOf(result);
            secondNumber = "";
            operator = "";

        } catch (Exception ex) {
            screen.setText("Hata: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}
