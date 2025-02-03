package com.easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int num : nums) {

            if (num == nums[n - 1]) {
                return num = 0;
            } else
                return num;
        }
        return 0;
    }

}
