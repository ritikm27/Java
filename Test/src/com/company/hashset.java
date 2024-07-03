package com.company;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        HashSet<Integer> hs= new HashSet<>();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        hs.add(8);
        hs.add(10);
        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(4));

        for(int i : hs){
            System.out.println(i);
        }
    }
}
