package com.rm;

import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={-45,598,5,10,-59,0,5};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
}
