package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class LargestOFThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a + " is largest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is largest");
        }
        else System.out.println(c+" is largest");
    }
}
