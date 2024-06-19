package org.example;

public class Stack {
    char stk[];
    int top=-1;
    int size;

    Stack(int size){
        this.size = size;
        stk= new char[size];
    }
    boolean isFull(){
        return top == stk.length-1;
    }
    boolean isEmpty(){
        return top == -1;
    }

    void push(char data){
        if (isFull()){
            System.out.println("Stack Overflow");
        }
        else{
//            top++;
            stk[++top]=data;
        }
    }

    char pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 'f';
        }
//        int temp = top;
//        top --;
        return stk[top--];
    }
    char peek(){
        return stk[top];
    }
    int size(){
        return top+1;
    }
}
