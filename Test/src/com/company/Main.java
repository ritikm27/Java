package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hellom More max");
//
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the name: ");
//        String Name = sc.nextLine();
//        System.out.println("The Name is : "+ Name);
//
//        int[] ans = {1,2,3,4,5};
//
//        for(int a : ans) {
//            System.out.println(a);
//        }

        int[][] ap = {{1,2,3},
                      {4,5,6},{7,8,9}};

        for (int a[] : ap) {
            for(int ax: a){
                System.out.print(ax + " ");
            }
        }
        int input =0 , output = 0;

        isFool(input , output);

        System.out.println(isFool(1,2));

    }

    private static int isFool(int input, int output) {
        return input + output;
    }
}
