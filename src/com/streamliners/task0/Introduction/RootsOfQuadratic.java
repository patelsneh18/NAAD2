package com.streamliners.task0.Introduction;

import java.util.Scanner;

public class RootsOfQuadratic {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the co-efficient of x^2");
        double a = myObj.nextDouble();

        System.out.println("Enter the co-efficient of x");
        double b = myObj.nextDouble();

        System.out.println("Enter the constant");
        double c = myObj.nextDouble();
        double D = b*b-4*a*c;
        double root2;
        double root1;
        if (D>=0) {
            root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("The roots of the equation are " + root1 + " and " + root2);
        }
        else{
            double real = -b/(2*a);
            double im = Math.sqrt(-D)/(2*a);
            System.out.println("The roots of the equation are " + real + " + " + im + "i" + " and " + real + " - " + im + "i");
        }
    }
}
