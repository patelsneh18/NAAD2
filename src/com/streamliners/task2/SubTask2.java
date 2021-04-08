package com.streamliners.task2;

import java.util.*;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        String[] result = s.split(";");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<result.length;i++){
            list.add(Integer.parseInt(result[i]));
        }
        Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        ArrayList<Integer> arrOfNums= new ArrayList<>(set);
        for (int i=0;i< set.size();i++){
            hashMap.put(arrOfNums.get(i),0);
        }

        for (int i=0;i<list.size();i++){
            hashMap.replace(list.get(i),hashMap.get(list.get(i)), hashMap.get(list.get(i))+1 );
        }

        return hashMap;
    }

}
