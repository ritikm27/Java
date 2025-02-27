package com.rm.Strings;

public class Stream {
    public static void main(String[] args){
        System.out.println(skipAppNotApple("bcappdappleabd"));
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1)); // up.substring(index) creates and return a substring of given string from the specified index
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return "" + skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return  skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }
    }

    static  String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
