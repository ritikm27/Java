package com.rm.easy;
public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }

    static boolean palin(int n){
        return n== reverseForLoop(n);
    }
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        String s=Integer.toString(n);
        return (int)((n%10)*(Math.pow(10,s.length()-1)) + reverse(n/10));

    }

    static int rev(int n, int temp){
        if(n==0){
            return temp;
        }

        temp= (temp * 10) + (n % 10);

        return rev(n/10,temp);
    }

    static int reverseForLoop(int n){
        int temp=n;
        int rev=0;
        while(temp != 0
        ){
            int r=temp % 10;
            rev= (rev * 10) + r;
            temp=temp/10;
        }

        return rev;
    }
}
