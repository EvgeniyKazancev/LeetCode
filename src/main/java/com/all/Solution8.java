package com.all;

import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] arr = new int[m + n];
        solution8.merge(nums1, m, nums2, n);
    String f = "sdfsdf";
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0,nums1,m,n);
      Arrays.sort(nums1);
    }
}

