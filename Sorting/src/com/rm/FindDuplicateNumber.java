package com.rm;

import static com.rm.BubbleSort.swap;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] a={3,1,4,4,2};
        int d=cyclicSort(a);
        System.out.println(d);
    }

    static int cyclicSort2(int[] a){
        int i=0;
        while(i<a.length){

            if(i!=a[i]-1){
                int correct=a[i]-1;
                if(a[i]!=a[correct]){
                    swap(a,i,correct);
                }
                else{
                    return a[i];
                }
            }
            else{
                i++;
            }
        }

        return -1;
    }

    static int cyclicSort(int[] a){
        for(int i=0;i<a.length;){
            if(i==a[i]-1){
                i++;
            }
            else if(i!=a[i]-1 && a[i]==a[a[i]-1]){
                return a[i];
            }
            else{
                swap(a,i,a[i]-1);
            }

        }

        return -1;
    }
}
