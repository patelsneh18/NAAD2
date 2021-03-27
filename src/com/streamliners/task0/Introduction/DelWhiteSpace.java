package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class DelWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i=0;i<stringBuilder.length();i++){
            if (stringBuilder.charAt(i) == ' '){
                stringBuilder.deleteCharAt(i);
            }
        }
        System.out.println(stringBuilder);
    }
}
