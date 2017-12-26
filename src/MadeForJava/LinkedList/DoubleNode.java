package MadeForJava.LinkedList;

/**
 * Created by sunginjung on 12/20/17.
 */
public class DoubleNode {

    private int data;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }
}
