package com.easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        int[] nums1 = {1};
        int[] nums2 = {1};
        int[] result = obj.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
       if (nums1 == null || nums2 == null){
           return new int[0];
       }
       List<Integer> res = new ArrayList<>();
      for (int i = 0; i < nums1.length ; i++){
          for (int j = 0; j < nums2.length ; j++){
              if (nums1[i] == nums2[j]){
                  res.add(nums1[i]);
                  break;
              }
          }
      }
        Set<Integer> uniqueSet = new HashSet<>(res);

      int[] result = new int[uniqueSet.size()];
      int index = 0;
      for (int num : uniqueSet){
          result[index++] = num;
      }

      return result;
    }
}
