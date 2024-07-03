//leetcode 645

package com.rm;

import java.util.Arrays;

import static com.rm.BubbleSort.swap;

public class SetMismatch {
    public static void main(String[] args) {
        int[] a={1,2,2,4};
        int[] ans=findErrorNums(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] a) {

        int[] ans=new int[2];
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
                ans[0]=a[i];
                ans[1]=i+1;
            }
        }

        return ans;
    }
}
