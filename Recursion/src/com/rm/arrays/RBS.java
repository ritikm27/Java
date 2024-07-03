package com.rm.arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr={20,25,30,5,8,10,12};
        System.out.println(search(arr,8,0,arr.length-1));
    }

    static int search(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target<=arr[mid] && target>=arr[s]){
              return  search(arr,target,s,mid-1);
            } else{
              return  search(arr,target,mid+1,e);
            }
        }

        if(target>=arr[mid] && target<=arr[e]){
           return search(arr,target,mid+1,e);
        }else{
           return search(arr,target,s,mid-1);
        }


    }
}
