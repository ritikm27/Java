package com.rm.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> list= subSetDuplicate(arr);
        for (List<Integer> l : list){
            System.out.println(l);
        }


    }

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start=0;
            // if the current element of arr is same as previous element, the start=end+1
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }


}
