package com.rm;

import java.util.Stack;

public class SortUsingStack {
    public static void main(String[] args){
        Stack<Integer> input = new Stack<>();
        input.push(23);
        input.push(12);
        input.push(78);
        input.push(45);
        input.push(34);

        Stack<Integer> tempStack = sortStack(input);
        System.out.println(tempStack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tempStack= new Stack<>();

        while(!input.isEmpty()){
            int temp=input.pop();

            while(!tempStack.isEmpty() && tempStack.peek()>temp){

                input.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        return tempStack;

    }
}
