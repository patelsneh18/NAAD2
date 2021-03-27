package com.streamliners.task0.Strings;

import java.util.Scanner;

public class NumericString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)<=48 || s.charAt(i)>=58){
                System.out.println("String is not numeric");
                return;
            }
        }
        System.out.println("String is numeric");
    }
}
