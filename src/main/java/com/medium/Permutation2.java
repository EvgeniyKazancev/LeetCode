package com.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        Permutation2 p = new Permutation2();
        List<Integer> resultList = new ArrayList<>();

        System.out.println(p.permute(new int[]{3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        back(res, nums, new ArrayList<>());
        return res;
    }

    public static void back(List<List<Integer>> res, int[] nums, List<Integer> tempList) {
        if (tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))
                    continue;

                    tempList.add(nums[i]);
                    back(res, nums, tempList);
                    tempList.remove(tempList.size() - 1);

            }
        }
    }
}
