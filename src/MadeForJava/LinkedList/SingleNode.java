package MadeForJava.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by sunginjung on 12/19/17.
 */
public class SingleNode {

    private int data;
    private SingleNode next;

    public SingleNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public SingleNode getNext() {
        return this.next;
    }
}
