package com.challenge.main;

import java.util.LinkedList;

public class challenge2 {
    public static void main(String[] args) {
        pseudoStack test= new pseudoStack();

        test.printStack();
        test.push(1);
        test.printStack();

        for(int i=0;i<10;i++){
            test.push(i*9);
        }

        test.printStack();

        test.pop();

        test.printStack();


    }

    public static class pseudoStack {
        LinkedList<Integer> stack=new LinkedList<>();

         void push(int input){
            stack.add(input);
            System.out.println("Value added to the stack: "+ input);
        }

         void pop(){
             int last=stack.getLast();
             stack.removeLast();
             System.out.println("Value removed from the stack: " +last);
        }

        void printStack(){
            System.out.println("Current Stack:" + stack.toString());
        }
    }

}
