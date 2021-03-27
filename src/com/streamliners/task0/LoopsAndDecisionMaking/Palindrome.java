package com.streamliners.task0.LoopsAndDecisionMaking;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (temp!=0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        if (rev == n) System.out.println("Nmber is palindrome");
        else System.out.println("Number is not palindrome");
    }
}
