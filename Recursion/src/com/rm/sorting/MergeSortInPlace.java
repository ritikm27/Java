package com.rm.sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,3,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int m= s + (e-s)/2;

        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m,e);

        mergeInPlace2(arr,s,m,e);
    }

    // this do not work for small arrays
    static void mergeInPlace(int[] arr,int s,int m,int e){
        int i=s;
        int j=m;

        while(i<m+1 && j<=e){
            if(arr[i]>arr[j]){
                swap(arr,i,j);
                i++;
            }else{
                j++;
            }
        }


    }

    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void mergeInPlace2(int[] arr,int s,int m,int e){
        int[] mix= new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
