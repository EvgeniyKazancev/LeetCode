package com.all;

import java.util.Arrays;

public class Solution11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[] nums = {3, 3};
        solution11.containsDuplicate(nums);
        // System.out.println(solution11);
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }


        return false;
        //return Arrays.stream(nums)
        // .boxed()
        // .distinct()
        // .toList()
        // .size() != nums.length;
    }
}
