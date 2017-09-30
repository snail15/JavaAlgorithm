package LinkedList;

/**
 * Created by sunginjung on 9/30/17.
 */
public class Node {
    Node next;
    int value;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void show(){
        System.out.print("{ ");
        System.out.print(this.value);
        System.out.print(" } ");
    }

}
