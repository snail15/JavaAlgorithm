package LinkedList;

/**
 * Created by sunginjung on 9/30/17.
 */
public class SinglyLinkedList {

    private Node head;
    private Node tail;
    int size;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node insertHead(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
            this.size++;
        }else{
            node.next = this.head;
            this.head = node;
            this.tail.next = null;
            this.size++;
        }
        return node;
    }

    public Node insertLast(Node node){
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else {
            node.next = null;
            this.tail.next = node;
            this.tail = node;
            this.size++;
        }

        return this.tail;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public Node removeFirst(){
        if(this.isEmpty()){
            System.out.println("It is already empty list..");
        }
        if(this.head == null){
            this.tail = null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        this.size--;
        return temp;

    }

    public void displayList(){
        if(this.isEmpty()){
            System.out.println("It is already empty list..");
        }
        Node head = this.head;
        while(head != null){
            head.show();
            head = head.next;
        }
    }

    public int showSize(){
        return this.size;
    }
}
