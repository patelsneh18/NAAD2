package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;

public class SubTask1 {

    public static void main(String[] args) {
        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s) {
        String[] result = s.split(";");
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<result.length;i++){
            list.add(Integer.parseInt(result[i]));
        }
        return list;
    }

}
