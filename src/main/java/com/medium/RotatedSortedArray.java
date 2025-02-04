package com.medium;

public class RotatedSortedArray {
    public static void main(String[] args) {
        RotatedSortedArray solution = new RotatedSortedArray();
        int[] nums = new int[]{1};
        int target = 1;
        System.out.println(solution.search(nums, target));
    }
    public int search(int[] nums, int target) {
       for (int i = 0; i < nums.length ; i++) {
           if (nums[i] == target){
               return i;
           }
       }
       return -1;
    }
}
