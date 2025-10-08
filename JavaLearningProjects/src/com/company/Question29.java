package com.company;
import java.util.Stack;

class Question29 {
    static boolean HarfBul(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    static boolean SayiBul(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    static boolean Operator_Bul(char c)
    {
        return (!HarfBul(c) && !SayiBul(c));
    }

    static int İsaretler(char C) {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;

        return 0;
    }

    static String Tersi(char str[], int start, int end) {
        char temp;
        while (start < end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(char[] infix1) {
        System.out.println(infix1);
        String infix = '(' + String.valueOf(infix1) + ')';
        int l = infix.length();
        Stack<Character> char_stack = new Stack<>();
        String output="";
        for (int i = 0; i < l; i++) {
            if (HarfBul(infix.charAt(i)) || SayiBul(infix.charAt(i)))
                output += infix.charAt(i);

            else if (infix.charAt(i) == '(')
                char_stack.add('(');

            else if (infix.charAt(i) == ')') {
                while (char_stack.peek() != '(') {
                    output += char_stack.peek();
                    char_stack.pop();
                }
                char_stack.pop();
            }
            else {
                if (Operator_Bul(char_stack.peek())) {
                    while ((İsaretler(infix.charAt(i)) < İsaretler(char_stack.peek())) || (İsaretler(infix.charAt(i)) <= İsaretler(char_stack.peek()) && infix.charAt(i) == '^'))
                    {
                        output += char_stack.peek();
                        char_stack.pop();
                    }


                    char_stack.add(infix.charAt(i));
                }
            }
        }
        while(!char_stack.empty()){
            output += char_stack.pop();
        }
        return output;
    }

    static String infixToPrefix(char[] infix) {
        int l = infix.length;
        String infix1 = Tersi(infix, 0, l - 1);
        infix = infix1.toCharArray();

        for (int i = 0; i < l; i++) {
            if (infix[i] == '(') {
                infix[i] = ')';
                i++;
            }
            else if (infix[i] == ')') {
                infix[i] = '(';
                i++;
            }
        }
        String prefix = infixToPostfix(infix);
        prefix = Tersi(prefix.toCharArray(), 0, l-1);

        return prefix;
    }

    public static void main(String[] args) {
        String s = ("x+y*z/w+u");
        System.out.print(infixToPrefix(s.toCharArray()));
    }
}