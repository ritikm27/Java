package com.rm.Strings;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        System.out.println(l1);
//        List<Integer> l2= new ArrayList<>(l1.get(0));
        List<Integer> l2 = new ArrayList<>(l1);
        // here in new ArrayList<>(_____) we can put an arraylist as an argument only
        System.out.println(l2);
        l2.add(5);
        l2.add(6);
        System.out.println(l2);
        l2.addAll(l1);
        System.out.println(l2);
        System.out.println(l1);


    }

}
