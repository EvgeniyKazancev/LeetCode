package com.easy;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleN = new SingleNumber();
        int[] nums = new int[]{1,1,2,2,5};
        System.out.println(singleN.singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

}
