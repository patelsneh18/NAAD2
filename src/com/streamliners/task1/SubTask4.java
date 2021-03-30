package com.streamliners.task1;

import java.util.*;

public class SubTask4 {
    public static void main(String[] args) {
        String s = "12332321";
        String replacements = "2R4D";
        if(!checkCustomReg(s, replacements)) {
            System.out.println("ERROR: The replacement string is not correct.");
            return;
        }
        System.out.println(modify(s, replacements));
    }


        private static String modify(String s, String replacements) {
            //Write your code here!
            char[] ch = replacements.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                int index = replacements.indexOf(s.charAt(i)) + 1;
                sb.append(ch[index]);
            }
            return sb.toString();
        }

        public static boolean checkCustomReg(String s,String replacements){
            Set<Character> numStr = new HashSet<>();
            for (int i=0;i<s.length();i++){
                numStr.add(s.charAt(i));
            }
            ArrayList<Character> numStrArr = new ArrayList<Character>(numStr);
            Collections.sort(numStrArr);
            ArrayList<Character> replaceArr = new ArrayList<>();
            for (int i = 0; i < replacements.length(); i+=2) {
                replaceArr.add(replacements.charAt(i));
            }
            Collections.sort(replaceArr);
            for (int i = 1; i < replacements.length(); i += 2) {
                if (Character.isLetter(replacements.charAt(i))) continue;
                return false;
            }
            if (!numStrArr.equals(replaceArr)) return false;
            return true;


        }
}
