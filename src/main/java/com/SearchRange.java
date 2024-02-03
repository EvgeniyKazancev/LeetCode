package com;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        int[] nums = {1};
        int target = 1;
        int[] result = searchRange.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] searchRange(int[] nums, int target) {



        int count = 0;
        int[] resultArray;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums.length <= 1 && nums[i] == target) {
                   resultArray = new int[1];
                   resultArray[i] = nums[i];

                   break;
            }else  if (nums[i] == target) {
                count++;
            }
        }

          if (count == 0 ){
             resultArray = new int[2];
              resultArray[0] = -1;
              resultArray[1] = -1;

          }else
              resultArray = new  int[count];
             int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == target) {
                resultArray[index] = i;
                index++;
            }
        }
        return resultArray;
    }
}
