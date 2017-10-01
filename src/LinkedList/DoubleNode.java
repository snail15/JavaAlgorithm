package LinkedList;

/**
 * Created by sunginjung on 9/30/17.
 */
public class DoubleNode {
    DoubleNode next;
    DoubleNode previous;
    int value;

    public DoubleNode(int value){
        this.value = value;
        this.next  = null;
        this.previous = null;
    }

    public void show(){
        System.out.print("{");
        System.out.print(this.value);
        System.out.print("} ");
    }
}
