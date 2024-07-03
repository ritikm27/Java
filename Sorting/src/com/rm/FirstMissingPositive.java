//leetcode 41

package com.rm;

import static com.rm.BubbleSort.swap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a={7,8,9,11,12};
        int ans=firstMissingPositive(a);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] a) {
        int ans=-1;
        for(int i=0;i<a.length;){

            if(i==a[i]-1 || a[i]<=0 || a[i]>a.length){
                i++;
            }
            else if(i!=a[i]-1 && a[i]==a[a[i]-1]){
                i++;
            }
            else{
                swap(a,i,a[i]-1);
            }
        }

        for(int i=0;i<a.length;i++){

            if(i!=a[i]-1){
                ans=i+1;
                return ans;
            }
        }

        return ans;
    }
}
