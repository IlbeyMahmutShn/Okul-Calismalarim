package com.company;

import java.util.Scanner;
import java.util.Random;

public class Minefield {
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
    int lineNumber , colNumber , size;
    int [][] map;
    int [][] board;
    boolean game = true;

    Minefield(int lineNumber , int colNumber) {
        this.lineNumber = lineNumber;
        this.colNumber = colNumber;
        this.map = new int[lineNumber][colNumber];
        this.board = new int[lineNumber][colNumber];
        this.size = lineNumber * colNumber;
    }
    public void run() {
        int line , col , success = 0;
        prapareGame();
        System.out.println("Oyun başladı");
        while (game) {
            print(board);
            System.out.println("Satır : ");
            line = keyboard.nextInt();
            System.out.println("Sütun : ");
            col = keyboard.nextInt();

            if (line < 0 || line >= lineNumber) {
                System.out.println("Geçersiz giriş");
                continue;
            }
            if (col < 0 || line >= colNumber) {
                System.out.println("Geçersiz giriş");
                continue;
            }

            if (map[line][col] != -1) {
                check(line , col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Başardınız hiç bir mayına basmadınız");
                    break;
                }
            }
            else {
                game = false;
                System.out.println("Game Over");
            }
        }
    }
    public void check (int line , int col) {
        if (map[line][col] == 0) {
            if ((line < colNumber - 3) && (map[line + 1][col] == -1)) {
                board[line][col]++;
            }
            if ((col < colNumber - 1) && (map[line][col + 1] == -1)) {
                board[line][col]++;
            }
            if ((line > 0) && (map[line - 1][col] == -1)) {
                board[line][col]++;
            }
            if ((col > 0) && (map[line][col - 1] == -1)) {
                board[line][col]++;
            }
            if (board[line][col] == 0) {
                board[line][col] = -2;
            }
        }
    }
    public void prapareGame() {
        int randomLine , randomCol , count = 0;

        for (int index = 0; index <= size / 4; index++) {
            randomLine = random.nextInt(lineNumber);
            randomCol = random.nextInt(colNumber);
            if (map[randomLine][randomCol] != -1) {
                map[randomLine][randomCol] = -1;
                count++;
            }

        }
    }
    public void print(int[][] arr) {
        for (int index = 0; index < arr.length; index++) {
            for (int jindex = 0; jindex < arr[0].length; jindex++) {
                if (arr[index][jindex] >= 0) {
                    System.out.println(" ");
                    System.out.print(arr[index][jindex] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int line , column;
        System.out.println("Mayın tarlasına hoşgeldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.println("Satır Sayısı : ");
        line = keyboard.nextInt();
        System.out.println("Sütun sayısı : ");
        column = keyboard.nextInt();

        Minefield mayin = new Minefield(line , column);
        mayin.run();

    }
}
