package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class RoundDecimalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        double number = sc.nextDouble();
        System.out.println("Enter decimal places you want to round to:");
        int num = sc.nextInt();
        double result = Math.round(number*Math.pow(10, num))/Math.pow(10, num);
        System.out.println("The rounded off number is " + result);
    }

}
