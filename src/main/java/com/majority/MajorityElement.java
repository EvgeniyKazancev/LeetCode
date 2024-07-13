package com.majority;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {1, 1, 3, 3, 3};
        System.out.println("Majority Element: " + majorityElement.majority(nums));
    }

    public int majority(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        int majorityCount = nums.length / 2 + 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= majorityCount) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
