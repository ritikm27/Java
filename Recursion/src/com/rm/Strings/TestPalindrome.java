package com.rm.Strings;

public class TestPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(1010));
    }

    static boolean checkPalindrome(int a){
        int n=a;
        int p=0;
        while(n>0){
            p=p*10+n%10;
            n=n/10;
        }
        return p==a;
    }


}
