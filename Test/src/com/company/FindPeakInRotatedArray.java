package com.company;

public class FindPeakInRotatedArray {
    public static void main(String[] args) {
        int[] a={3,4,5,6,7,8,9,10,11};
        System.out.println(Peak(a));
    }

    static int Peak(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mid=0;

        while(s<=e){
            mid=s+(e-s)/2;

            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[s]<arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
