package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter Char to find Frequency of");
        char ch = sc.next().charAt(0);
        int f=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == ch) f++;
        }
        System.out.println("Frequency of " + ch + " is " + f);
    }
}
