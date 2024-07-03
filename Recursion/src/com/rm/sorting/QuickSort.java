package com.rm.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int low,int hi){
        if(low >=hi){
            return;
        }

        int s=low;
        int e=hi;
        int m=s + (e-s)/2;
        int pivot= arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            // we are adding this check again because the above two while loops could stop
            // because of violating condition when s and e can cross each other
            // it is also a reason that if it is already sorted it will not swap
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]= temp;
                s++;
                e--;
            }
        }
        // now the pivot is at correct index, now solve the other two halves
        quickSort(arr,low,e);
        quickSort(arr,s,hi);
    }
}
