package LinkedList;

import java.util.HashSet;

/**
 * Created by sunginjung on 9/30/17.
 */
public class DoublyLinkedList {
    DoubleNode head;
    DoubleNode tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return (this.head == null);
    }

    public void displayList(){

        DoubleNode current = this.head;

        while(current != null){
            current.show();
            current = current.next;
        }
    }

    public void insertFirst(int value){

        DoubleNode newNode = new DoubleNode(value);

        if(this.isEmpty()){
            this.tail = newNode;
        } else {
            this.head.previous = newNode;
        }

        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertLast(int value){

        DoubleNode newNode = new DoubleNode(value);

        if(this.isEmpty()){
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;

        }
        this.tail = newNode;
    }

    public DoubleNode deleteFirst(){

        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("It's empty list");
        }

        if(this.head.next == null){
            this.tail = null;
        }

        DoubleNode temp = this.head;
        this.head.next.previous = null;
        this.head = this.head.next;

        return temp;
    }

    public DoubleNode deleteLast(){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("It's empty list");
        }

        if(this.head.next == null){
            this.head = null;
        }

        DoubleNode temp = this.tail;
        this.tail.previous.next = null;
        this.tail = this.tail.previous;

        return temp;

    }

    public void insertAfter(int index, int value){
        DoubleNode newNode = new DoubleNode(value);

        DoubleNode current = this.head;
        for(int i = 0 ; i < index; i++ ){
            current = current.next;
        }

        newNode.next = current.next;
        current.next.previous = newNode;
        current.next = newNode;
        newNode.previous = current;

    }

    public void delete(int index){
        DoubleNode current = this.head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
    }

    public void deleteDup() {
        DoubleNode current = this.head;
        HashSet<Integer> set = new HashSet<Integer>();

        while(current != null){
            if(set.contains(current.value)){
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }else{
                set.add(current.value);
            }
            current = current.next;
        }
    }

    public DoubleNode kthLast(int k){
        DoubleNode leftPointer = this.head;
        DoubleNode rightPointer = this.head;

        for(int i = 0; i < k - 1; i++){
            if(rightPointer.next == null){
                throw new IndexOutOfBoundsException("List Too Short");
            }
            rightPointer = rightPointer.next;
        }

        while(rightPointer.next != null){
            rightPointer = rightPointer.next;
            leftPointer = leftPointer.next;
        }

        return leftPointer;

    }

    public boolean isPalindrome(){
        DoubleNode leftPointer = this.head;
        DoubleNode rightPointer = this.head;

        int idx = 0;
        while(rightPointer.next != null){
            rightPointer = rightPointer.next;
            idx++;
        }

        for(int i = 0; i < idx / 2; i++){
            if(leftPointer.value != rightPointer.value){
                return false;
            }
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.previous;
        }

        return true;


    }


}
