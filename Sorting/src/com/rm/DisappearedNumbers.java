//leetcode 448  google

package com.rm;
import java.util.*;
import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class DisappearedNumbers {

    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(a));
    }
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        // searching for the missing elements
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                arr.add(j+1);
            }
        }

        return arr;
    }
}
