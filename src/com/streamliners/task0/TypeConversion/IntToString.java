package com.streamliners.task0.TypeConversion;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        System.out.println("String is: " + str);
    }
}
