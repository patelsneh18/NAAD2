package com.streamliners.task1;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights) {
        //Write your code here!
        s.toUpperCase();
        char[] ch = s.toCharArray();
        int weight = 0;
        for (int i=0;i<s.length();i++){
            int index = ch[i] - 65;
            weight += weights[index];
        }
        return weight;
    }

}
