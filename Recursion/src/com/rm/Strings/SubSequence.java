package com.rm.Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args){
       String s="abc";
       subSeq("",s);
//       subSeqAscii("",s);
       System.out.println(subSeqReturn("",s));
        System.out.println(subSeqReturn2("",s,new ArrayList<>()));
    }

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);
        subSeq(p+ch,up.substring(1)); // this will take the character(element) ch
        subSeq(p,up.substring(1)); // this will ignore the character(element) ch
    }

    static void subSeqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+ (ch+0),up.substring(1));
    }

    static ArrayList<String> subSeqReturn(String p,String up){
        // we can also put an edge case to remove the print of space at the end
        // by adding if(up.isEmpty() && p.isEmpty())
//        if(up.isEmpty() && p.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            return list;
//        }

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left= subSeqReturn(p+ch,up.substring(1));
        ArrayList<String> right= subSeqReturn(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subSeqReturn2(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left= subSeqReturn2(p+ch,up.substring(1),new ArrayList<>());
        ArrayList<String> right= subSeqReturn2(p,up.substring(1),new ArrayList<>());

        left.addAll(right);
        return left;

    }
}
