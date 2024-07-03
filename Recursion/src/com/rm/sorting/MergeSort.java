package com.rm.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={2,4,5,6,3,1};
//        arr=mergeSort(arr);
        int[] ans=mergeSort(arr);
//        System.out.println(Arrays.toString(mergeSort(arr)));
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr){  // this function will create a new array and return that array
        if(arr.length <= 1){            // it will not sort or do anything on the actual array
            return arr;
        }
        int mid= arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));  // in Arrays.copyOfRange(arr,indexStart,indexEnd) function indexEnd is exclusive
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        int[] ans = merge(left,right);

        return ans;
    }

    static int[] merge(int[] first, int[] second){
        int[] mix= new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }else{
                mix[k]=second[j];
                j++;
                k++;
            }
        }

        // It may be possible that one of the arrays is not completely copied
        // so to copy remaining elments
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
}
