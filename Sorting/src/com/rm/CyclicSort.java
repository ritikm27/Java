package com.rm;

import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int[] arr){

        for(int i=0;i<arr.length;){
            if(i==arr[i]-1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }
}
