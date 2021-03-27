package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet");
        Scanner myObj = new Scanner(System.in);
        char ch = myObj.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') System.out.println(ch + " is vowel");
        else System.out.println(ch + " is consonant");
    }
}
