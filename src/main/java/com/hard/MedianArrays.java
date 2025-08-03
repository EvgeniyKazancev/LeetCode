package com.hard;

import java.util.Arrays;
import java.util.Formatter;

public class MedianArrays {
    public static void main(String[] args) {
       int[] arr1 = {1,3};
       int[] arr2 = {2};

       double res = MedianArrays.findMedianSortedArrays(arr1,arr2);
        System.out.println(res);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median ;
        int[] mergeArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergeArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergeArray, nums1.length, nums2.length);
        Arrays.sort(mergeArray);

        if (mergeArray.length % 2 == 0){
              int index1 = (mergeArray.length / 2)- 1;
              int index2 = index1 + 1;

                double med1 = mergeArray[index1];
                double med2 = mergeArray[index2];
             median = (med1 + med2) / 2;
        }else{
            int index = mergeArray.length / 2;
            median = mergeArray[index];
        }

        return median;
    }
}
