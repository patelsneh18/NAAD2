package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class MulitplyFloats {
    public static void main(String[] args) {
        System.out.println("Enter two Floating Point Numbers");
        Scanner myObj = new Scanner(System.in);
        float float1 = myObj.nextFloat();
        float float2 = myObj.nextFloat();
        float ans = float1 * float2;
        System.out.println("The sum is " + ans);
    }
}
