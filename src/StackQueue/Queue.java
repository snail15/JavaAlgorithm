package StackQueue;

import java.util.NoSuchElementException;

/**
 * Created by sunginjung on 9/30/17.
 */
public class Queue {

    QueueNode head;
    QueueNode tail;

    private static class QueueNode{
        QueueNode next;
        int value;

        public QueueNode(int value){
            this.value = value;
            this.next = null;
        }

        public void show(){
            System.out.print("{");
            System.out.print(this.value);
            System.out.print("}");
        }
    }

    public Queue(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return (this.head == null);
    }

    public void add(int value){
        QueueNode newNode = new QueueNode(value);

        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public int remove(){
        if(this.head == null){
            throw new NoSuchElementException("Empty Queue?");
        }

        QueueNode temp = this.head;
        this.head = this.head.next;

        return temp.value;
    }

    public void peek(){
        System.out.println("First in line: " + this.head.value);
    }

    public void displayQueue(){
        QueueNode current = this.head;

        while(current != null){
            current.show();
            current = current.next;
        }
    }
}
