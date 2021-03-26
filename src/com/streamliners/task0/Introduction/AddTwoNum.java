package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int add = num1 + num2;
        System.out.println("The sum is: " + add);
    }
}
