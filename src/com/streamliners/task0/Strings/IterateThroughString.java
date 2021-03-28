package com.streamliners.task0.Strings;

import java.util.Scanner;

public class IterateThroughString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + ", ");
        }

    }
}
