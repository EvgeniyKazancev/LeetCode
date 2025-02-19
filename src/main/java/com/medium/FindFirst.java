package com.medium;

import java.util.Arrays;

public class FindFirst {
    public static void main(String[] args) {
        FindFirst obj = new FindFirst();
        int[] arr = {2, 1,3,3,5};
        int target = 4;
        int[] ints = obj.searchRange(arr, target);
        System.out.println(Arrays.toString(ints));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (nums == null || nums.length == 0) {

            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (res[0] == -1) {
                    res[0] = i;
                }

                res[1] = i;
            }
        }

    return res;
    }
}
