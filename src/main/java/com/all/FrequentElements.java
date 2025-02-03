package com.all;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequentElements {


    public int[] topKFrequent(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        if (nums.length == 0) {
            return null;
        }
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
              pq.addAll(countMap.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
                result[i] = pq.poll().getKey();
        }
        return result;
    }


}


