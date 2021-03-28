package com.streamliners.task0.Strings;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String("string");
        String str2 = new String("string");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
