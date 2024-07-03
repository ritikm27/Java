package com.rm.easy;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(15846));
        System.out.println(rev1(15846));
    }
    static int sum=0;
    static int rev1(int n){
        if(n==0){
            return 0;
        }
        sum=sum*10 + n%10;
        rev1(n/10);
        return sum;
    }
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        String s=Integer.toString(n);
        return (int)((n%10)*(Math.pow(10,s.length()-1)) + reverse(n/10));

    }
}
