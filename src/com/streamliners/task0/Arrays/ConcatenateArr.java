package com.streamliners.task0.Arrays;

public class ConcatenateArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] combine = new int[arr1.length+arr2.length];
        for (int i=0;i<(arr1.length+arr2.length);i++){
            if (i< arr1.length) combine[i] = arr1[i];
            else combine[i] = arr2[i-arr1.length];
        }
        for (int n:combine){
            System.out.print(n+" ");
        }
    }
}
