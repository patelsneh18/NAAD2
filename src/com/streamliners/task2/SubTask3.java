package com.streamliners.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class SubTask3 {

    public static void main(String[] args) {
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(s);
        StringBuilder strReplace = new StringBuilder(s);
        int consonantsCount=0;
        for (int i=0;i<s.length();i++){
            if (strReplace.charAt(i) == 'A' || strReplace.charAt(i) == 'E' || strReplace.charAt(i) == 'I' || strReplace.charAt(i) == 'O' || strReplace.charAt(i) == 'U') continue;
            else {
                strReplace.setCharAt(i,'_');
                consonantsCount++;
            }
        }
        int chances=consonantsCount+3;
        while (chances!=0 && consonantsCount!=0){
            System.out.println("Word : " + strReplace);
            System.out.println("Chances : " + chances);
            System.out.print("Guess : ");
            String ch = sc.nextLine();
            ch = ch.toUpperCase();
            ArrayList<Integer> arr = new ArrayList<>();
            int search=0;
            while (true){
                int index = str.indexOf(ch,search);
                if (index== (-1)) break;
                else{
                    arr.add(index);
                    search = index+1;
                }
            }
            int rCount=0;
            for (int i=0;i<arr.size();i++){
                if (strReplace.charAt(arr.get(i))=='_') {
                    strReplace.setCharAt(arr.get(i),str.charAt(arr.get(i)));
                    rCount++;
                    consonantsCount--;
                }
                else continue;
            }
            System.out.println("Character found " + rCount + " time(s)");
            chances--;
            // chances-1
        }
    }

}
