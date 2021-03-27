package com.streamliners.task0.Strings;

import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean space = true;
        char[] charArray = str.toCharArray();
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(charArray[i])){
                if (space){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    space = false;
                }
            }
            else space = true;
        }
        str = String.valueOf(charArray);
        System.out.println(str);
    }
}
