package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter two num");
        Scanner newObj = new Scanner(System.in);
        int a = newObj.nextInt();
        int b = newObj.nextInt();
        System.out.println("Before Swapping a = " + a +" b = " + b);
        a = b+a;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping a = "+ a + " b = "+ b);

    }
}
