package com.rm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={5,4,2,3,1};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);

                }
            }
        }
    }

    static void swap(int[] arr, int index1,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


}
