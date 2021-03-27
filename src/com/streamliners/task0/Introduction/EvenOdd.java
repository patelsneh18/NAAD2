package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num%2==0) System.out.println(num + " is even");
        else System.out.println(num + " is odd");
    }
}
