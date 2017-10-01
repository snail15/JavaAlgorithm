package StackQueue;

import java.util.*;
import java.util.Stack;

/**
 * Created by sunginjung on 9/30/17.
 */
public class QueueViaStack {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueViaStack(){
        this.inputStack = new Stack<Integer>();
        this.outputStack = new Stack<Integer>();
    }

    public boolean isEmpty(){
        return (this.inputStack.size() == 0 && this.outputStack.size() == 0);
    }

    public void add(int value){

        this.inputStack.push(value);
    }

    private void shiftStack(){
        if(this.outputStack.isEmpty()){
            while(!this.inputStack.isEmpty()){
                this.outputStack.push(this.inputStack.pop());
            }
        }
    }

    public void peek(){
        shiftStack();
        System.out.println(outputStack.peek());
    }

    public int remove(){
        shiftStack();
        return this.outputStack.pop();
    }


}
