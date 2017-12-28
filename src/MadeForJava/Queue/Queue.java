package MadeForJava.Queue;

import MadeForJava.LinkedList.SingleNode;

/**
 * Created by sunginjung on 12/28/17.
 */
public class Queue {

    public SingleNode head;
    public SingleNode tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(SingleNode newNode) {

        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }

        if(this.tail != null) {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

    }

    public SingleNode dequeue() {

        if(this.head == null) {
            throw new IndexOutOfBoundsException("Queue empty!!");
        }

        SingleNode frontNode = this.head;

        this.head = this.head.getNext();

        return frontNode;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int front() {
        return this.head.getData();
    }
}
