package com.all;

public class TestB {
    public static void main(String[] args) {
        TestB testB = new TestB();
        int[] test = new int[50];
        for (int i = 0; i < 50; i++) {
            test[i] = i;
        }
        int searchNum = 34;
        System.out.println(testB.searchBin(test,searchNum));
    }
    public int searchBin(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                min = mid + 1;

            }
            if (nums[mid] > target) {
                max = mid - 1;
            }

        }
        return -1;

    }
}
