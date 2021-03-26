package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class PrintAnInteger {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        System.out.println("The number is: " + num);
    }
}
