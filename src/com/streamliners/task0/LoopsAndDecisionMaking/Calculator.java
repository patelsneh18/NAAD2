package com.streamliners.task0.LoopsAndDecisionMaking;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operation to perform (+,-,/,*,%)");
        char ch = sc.next().charAt(0);
        switch (ch){
            case '+':
                int sum = a+b;
                System.out.println("Answer: " + sum);
                break;
            case '-':
                int diff = a-b;
                System.out.println("Answer" + diff);
                break;
            case '*':
                int multi = a*b;
                System.out.println("Answer: "+ multi);
                break;
            case '%':
                int rem = a%b;
                System.out.println("Answer: " + rem);
                break;
            default:
                System.out.println("Invalid Operation");
        }

    }
}
