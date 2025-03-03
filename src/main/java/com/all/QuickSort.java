package com.all;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 5,6,3,4,9,7,2,45,64,43,23 };
        int n = arr.length;
        quickSort(arr, 0 , n -1);
        for (int s : arr){
            System.out.print(s + " ");
        }



    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
          int pivot = partition(arr, left, right);
          quickSort(arr, left, pivot - 1);
          quickSort(arr, pivot + 1, right);
        }

    }
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
           if (arr[j] <= pivot) {
               i++;
              swap(arr, i , j);
           }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
