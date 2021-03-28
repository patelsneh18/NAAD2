package com.streamliners.task0.Strings;

import java.util.Scanner;

public class ShuffleCheck {
    static boolean shuffleCheck(String str1,String str2,String result){
        if (result.length() != (str1.length()+str2.length())){
            return false;
        }
        int i=0,j=0,k=0;
        while (k!=result.length()){
            if (str1.charAt(i)==result.charAt(k)) i++;
            else if (str2.charAt(j) == result.charAt(k)) j++;
            else return false;
            k++;
        }
        if(i < str1.length() || j < str2.length()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a two string");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Enter result string");
        String res = sc.nextLine();
        boolean shuffle = shuffleCheck(str1,str2,res);
        if (shuffle) System.out.println("Yes! its shuffle");
        else System.out.println("Not a shuffle");
    }
}
