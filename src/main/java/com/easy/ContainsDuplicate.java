package com.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        Map<Integer, Integer> duplicatemap = new HashMap<>();
        for (int num : nums) {
            duplicatemap.put(num, duplicatemap.getOrDefault(num, -0) + 1);

        }
        for ( int count : duplicatemap.values())
            if (count > 1  ) {
                duplicate = true;

            }

        return duplicate;
    }
}