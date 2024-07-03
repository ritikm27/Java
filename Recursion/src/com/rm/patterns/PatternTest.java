package com.rm.patterns;

public class PatternTest {
    public static void main(String[] args){
        p1(1,5);
        p2(1,5,1);
        p3(1,5);
    }

    static void p1(int a,int n){
        if(n==0){
            return;
        }
        if(a<=n){
           System.out.print("* ");
           p1(a+1,n);
        }else{
            System.out.println("");
            p1(1,n-1);
        }

    }

    static void p2(int a,int n,int size){
       if(size>n){
           return;
       }
       if(a<=size){
           System.out.print("* ");
           p2(a+1,n,size);
       }else{
           System.out.println("");
           p2(1,n,size+1);
       }
    }

    static void p3(int a,int n){
        if(n==0){
            return;
        }
        if(a<=n){
            p3(a+1,n);
            System.out.print("* ");
        }else{
            p3(1,n-1);
            System.out.println("");
        }

    }
}
