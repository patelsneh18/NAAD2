package com.streamliners.task0.Strings;

import java.util.Scanner;

public class ContainsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.contains(str2)) System.out.println("Str1 contains str2");
        else if (str2.contains(str1)) System.out.println("Str2 contains str1");
    }
}
