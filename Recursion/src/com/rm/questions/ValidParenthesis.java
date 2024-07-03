package com.rm.questions;

public class ValidParenthesis {
    public static void main(String[] args) {

        String str="(){}}{";
        System.out.println(checkValid(str));

    }

    static boolean checkValid(String str){
        char[] ch= str.toCharArray();
        int j=0;
        int k=0;
        int l=0;

        for(int i=0;i<ch.length;i++){

            if(ch[i]=='('){
                j++;
                for(;j<ch.length;j++){
                    if(ch[j]==')'){
                        break;
                    }
                }

                if(j==ch.length){
                    return false;
                }

            }

            if(ch[i]=='{'){
                k++;
                for(;k<ch.length;k++){
                    if(ch[k]=='}'){
                        break;
                    }
                }

                if(k==ch.length){
                    return false;
                }

            }

            if(ch[i]=='['){
                l++;
                for(;l<ch.length;l++){
                    if(ch[l]==']'){
                        break;
                    }
                }

                if(l==ch.length){
                    return false;
                }

            }
        }

        return true;
    }
}
