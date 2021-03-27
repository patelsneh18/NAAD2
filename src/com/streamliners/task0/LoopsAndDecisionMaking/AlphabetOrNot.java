package com.streamliners.task0.LoopsAndDecisionMaking;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int asc = ch;
        if ((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) System.out.println("Character is an Alphabet");
        else System.out.println("Character is not an Alphabet");
    }
}
