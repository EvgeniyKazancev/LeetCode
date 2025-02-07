package com.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] nums = {1,2,3,9};
        int[] res = p.plusOne(nums);
        System.out.println(Arrays.toString(res));
    }
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
              if (digits[i] < 9) {
                  digits[i]++;
                  return digits;
              }
            digits[i] = 0;

        }

        int[] res = new int[n + 1];
        res[0] = 1;
        return res;

    }
}
