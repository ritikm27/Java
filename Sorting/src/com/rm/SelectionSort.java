package com.rm;

import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[0];
            int maxI = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxI = j;
                }
            }
            swap(arr, maxI, arr.length - 1 - i);
        }
    }



}
