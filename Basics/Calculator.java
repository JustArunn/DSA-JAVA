package Basics;

import java.util.Scanner;;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("\nEnter a opration : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.print("\nEnter two numbers : ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '/') {
                    if (b == 0) {
                        System.out.print("can't / by 0");
                    } else {
                        ans = a / b;
                    }
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '%') {
                    ans = a % b;
                }
                System.out.print("\nAns : " + ans);
            } else if (op == 'x' || op == 'X') {
                in.close();
                break;
            } else {
                System.out.println("Invalid opration !!");
            }
        }
    }
}
