package com.company;

public class BinarySearch {
    public static void main(String[] args){
//        int[] arr= {2,4,8,12,15,16,18,25,30};
//        System.out.println(BS(arr,5));
//        char ch='a';
//        System.out.println();
          char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));

    }

    static int BS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end){
            mid=start+ (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return arr[end];
    }



    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid=0;

        while(start<=end){
            mid=start + (end-start)/2;

            if(letters[mid]== target){
                return letters[mid+1];
            }
            else if(letters[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return letters[start];
    }
}


