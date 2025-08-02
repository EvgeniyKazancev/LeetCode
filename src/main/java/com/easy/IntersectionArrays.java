package com.easy;

import java.sql.Array;
import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] nums12 = {3,4,5,5};
        int[] nums22 = {1,4,5,8};




    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int n : nums1){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0  ){
                res.add(n);
                map.put(n,map.get(n) -1);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
     }
}
