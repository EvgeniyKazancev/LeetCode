package com.all;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {



        int[] arr = {1, 4, 3, 7, 8, 5, 2, 9, 6};
        TestSort.sortArr2(arr);
        printArray(arr);
        int target =3;
        int result = TestSort.search(arr, target);
       System.out.println(result);
    }


    public  static void sortArr2(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           int min = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[min]) {
                   min = j;
               }

           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    private static int search(int[] arr, int target) {
        int min = arr[0];
        int max = arr.length - 1;
        int index = (min + max) / 2;
        while (min <= max){
            if (arr[index] == target) {
                return index;
            }

            if (arr[index] > target) {
                max = index - 1;
            }
            if (arr[index] < target) {
                min = index + 1;

            }

        }
        return -1;
    }
}
