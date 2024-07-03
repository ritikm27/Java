//leetcode 442

package com.rm;

import java.util.ArrayList;

import static com.rm.BubbleSort.swap;


public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans=new ArrayList<>();
        ans=findDuplicates(a);
        System.out.println(ans);
    }

    static ArrayList<Integer> findDuplicates(int[] a){
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<a.length;){

            if(i==a[i]-1){
                i++;
            }
            else if(i!=a[i]-1 && a[i]==a[a[i]-1]){
                i++;
            }
            else{
                swap(a,i,a[i]-1);
            }
        }

        //searching the duplicates
        for(int i=0;i<a.length;i++){

            if(i!=a[i]-1){
                ans.add(a[i]);
            }
        }
        return ans;
    }
}
