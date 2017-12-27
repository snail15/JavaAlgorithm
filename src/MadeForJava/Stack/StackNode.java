package MadeForJava.Stack;

/**
 * Created by sunginjung on 12/27/17.
 */
public class StackNode {

    private int data;
    private StackNode below;

    public StackNode(int data) {
        this.data = data;
        this.below = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getBelow() {
        return below;
    }

    public void setBelow(StackNode below) {
        this.below = below;
    }
}
