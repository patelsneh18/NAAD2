package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter dividend and divisor");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int r = a%b;
        int q = a/b;
        System.out.println("Quotient: "+q+"\nRemainder: "+r);
    }
}
