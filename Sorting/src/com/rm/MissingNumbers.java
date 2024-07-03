//leetcode 268  amazon

package com.rm;

import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class
MissingNumbers {
    public static void main(String[] args) {
        int[] a={2,0,4,1};
        int mis=cyclicSort(a);
        System.out.println(mis);
    }

    static int cyclicSort(int[] a){
        int mis=a.length;
        for(int i=0;i<a.length;){
            if(a[i]>a.length-1 || i==a[i]){
                i++;
            }
            else{
                swap(a,i,a[i]);
            }
        }


        // searching the missing element in the array
        for(int i=0;i<a.length;i++){
            if(i!=a[i]){
                mis=i;
            }
        }

        return mis;
    }
}
