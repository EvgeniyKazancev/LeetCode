package com.all;

import java.sql.Array;

public class TaskSum {
    public static void main(String[] args) {
        TaskSum ts = new TaskSum();
        int[] arr = {1,2,3};
        int sum = ts.summa(arr,arr.length);
        int max = ts.maxInteger(arr);
        System.out.println(sum);
        System.out.println(max);
    }
    public static int summa(int[] arr , int length) {

        if (length == 0) {
            return 0;
        }else {

            return length+ summa(arr, length - 1);
        }

    }
    public int maxInteger (int[] arr ) {
        int max = arr[0];
        if (arr.length == 1) {
            return max;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
}
