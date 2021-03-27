package com.streamliners.task0.LoopsAndDecisionMaking;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series\n");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
