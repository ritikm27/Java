package com.easy;
public class BS {
    public static void main(String[] args) {
        int[] arr={2,3,5,34,55,59,95};
        System.out.println(BinarySearch(arr,2,0,arr.length));
    }

    static int BinarySearch(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }

        int mid=start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return BinarySearch(arr,target,mid+1,end);
        }
        return BinarySearch(arr,target,start,mid-1);
    }
}
