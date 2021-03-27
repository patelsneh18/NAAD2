package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        System.out.print("Enter a String\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == null || str.isEmpty()) {
            System.out.println("String is Empty or Null");
        }
        else System.out.println("String is not Empty or Null");
    }
}
