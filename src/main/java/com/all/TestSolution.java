package com.all;

import java.util.ArrayList;
import java.util.List;

public class TestSolution {


    public static void main(String[] args) {
        List<String> list =new ArrayList<>(20);
        list.add("dsv");
        list.add("advsbsvb");
        list.add("zsdvsdv");
        for (int i=0; i < list.size(); i++){
            String rrr = list.get(i);
            System.out.println(rrr);
        }
    }


}
