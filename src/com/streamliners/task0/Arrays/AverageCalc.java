package com.streamliners.task0.Arrays;

public class AverageCalc {
    public static void main(String[] args) {
        double[] arr = {12,10,30,21,11,65};
        double sum=0;
        for (double num:arr){
            sum+=num;
        }
        double avg = sum/arr.length;
        System.out.println("Average = "+avg);
    }
}
