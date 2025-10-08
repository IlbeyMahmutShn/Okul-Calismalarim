package com.company;
import java.util.*;

public class Question69 {
    static Scanner scanner = new Scanner(System.in);
    static int B , H;
    static boolean flag;

    public static boolean isFlag() {
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
            flag = true;
        }else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return flag;
    }
    public static void main(String[] args){
        if(isFlag()){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

