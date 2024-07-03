package com.rm.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={2,4,5,6,1,10,8};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int length){
       if(length<=1){
           return;
       }

       for(int i=0;i<length-1;i++){
           if(arr[i]<arr[i+1]){
               int temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
           }
       }

       sort(arr,length-1);
    }

}
