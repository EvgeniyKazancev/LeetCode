package com.all;

import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        new Solution9().subsetsWithDup(new int[]{1,2,2});

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
      Set<List<Integer>> setList = new HashSet<>();

        //Map<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {

            List<Integer> list = new ArrayList<>();
            int count = 0;
            int n = i;
            while (n > 0) {
                if (n % 2 == 1) {
                    list.add(nums[count]);
                }
                n = n / 2;
                count++;
            }
//            int key =0;
//            for (int j = 0; j < list.size(); j++) {
//                key += (j + 1) * 100 * list.get(j);
//            }
//                 if (!map.containsKey(key) ){
//                     setList.add(list);
//
//                 }
//            map.put(key,true);
           setList.add(list);
        }

        return setList.stream().toList();
    }
}
