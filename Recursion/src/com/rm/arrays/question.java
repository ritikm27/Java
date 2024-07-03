package com.rm.arrays;

import java.util.Arrays;

public class question {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        sumArray(arr);
    }

    static void sumArray(int[] arr){
        if(arr.length==0){
            return;
        }
        int[] newArray= new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newArray[i]=arr[i]+arr[i+1];
        }
        sumArray(newArray);
        System.out.println(Arrays.toString(arr));
    }
}
