package com.streamliners.task0.TypeConversion;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = 0;
        for (int i=0;i<str.length();i++){
            n = n*10 + str.charAt(i)-48;
        }
        System.out.println("Number is "+n);
    }
}
