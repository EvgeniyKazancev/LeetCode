package com.sumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 6, 7};
        int target = 7;
        CombinationSumII combinationSumII = new CombinationSumII();
        combinationSumII.combinationSum2(nums, target);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> res = new ArrayList<>();
      sum(candidates,target,0,res,new ArrayList<>());
      return res;
    }

    public static void sum(int[] nums, int target, int index, List<List<Integer>> res, List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;

            list.add(nums[i]);
            sum(nums, target - nums[i], i + 1, res, list);
            list.remove(list.size() - 1);

        }

    }
}






























