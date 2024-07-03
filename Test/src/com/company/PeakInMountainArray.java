package com.company;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,4,2,1};
        System.out.println(Peak(a));
    }

    static int Peak(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mid=0;

        while(s<=e){
            mid=s+(e-s)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

}
