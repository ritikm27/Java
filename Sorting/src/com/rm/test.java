package com.rm;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6};
//        bubble(arr);
//        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void selection(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int max=arr[0];
            int maxI=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxI=j;
                }
            }

            swap(arr,maxI,arr.length-1-i);
        }
    }

    static void bubble(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


