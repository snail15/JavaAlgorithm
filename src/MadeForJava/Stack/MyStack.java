package MadeForJava.Stack;

/**
 * Created by sunginjung on 12/27/17.
 */
public class MyStack {

    public StackNode top;

    public MyStack() {
        this.top = null;
    }

    public void push(StackNode newNode) {

        if(this.top == null){
            this.top = newNode;
        }

        newNode.setBelow(this.top);
        this.top = newNode;

    }

    public int top() {
        return this.top.getData();
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int pop() {
        int data = this.top.getData();

        this.top = this.top.getBelow();

        return data;
    }
}
