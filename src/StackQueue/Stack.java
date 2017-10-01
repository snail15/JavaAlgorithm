package StackQueue;

/**
 * Created by sunginjung on 9/30/17.
 */
public class Stack {

    StackNode top;
    StackNode bottom;
    int minimum = Integer.MAX_VALUE;

    private static class StackNode{
        int value;
        StackNode next;
        StackNode previous;


        public StackNode(int value){
            this.value = value;
            this.next = null;
            this.previous = null;
        }

        public void show(){
            System.out.print("{");
            System.out.print(this.value);
            System.out.print("}");
        }
    }

    public Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push(int value){
        StackNode newNode = new StackNode(value);

        if(value <= minimum){
            this.minimum = value;
        }

        if(this.isEmpty()){
            this.top = newNode;
        }else{
            StackNode oldTop = this.top;
            this.top.next = newNode;
            this.top = newNode;
            this.top.previous = oldTop;
        }
    }

    public void peek(){
        try{
            System.out.println(this.top.value);
        } catch (NullPointerException e){
            System.out.println("Empty Stack?");
        }

    }

    public int pop(){

        StackNode temp = this.top;
        this.top = this.top.previous;

        return temp.value;
    }

    public int min(){
        return this.minimum;
    }


}
