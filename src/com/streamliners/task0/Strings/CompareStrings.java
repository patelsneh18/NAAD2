package com.streamliners.task0.Strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println("Enter 2 strings");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.equals(str2)) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
    }
}
