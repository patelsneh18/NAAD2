package com.streamliners.task0.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Enter two strings");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (Arrays.equals(str1Array, str2Array)) System.out.println("Its an anagram");
        else System.out.println("Not an anagram");
    }
}
