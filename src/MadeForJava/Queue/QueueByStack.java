package MadeForJava.Queue;

import MadeForJava.LinkedList.SingleNode;

import java.util.Stack;

/**
 * Created by sunginjung on 12/28/17.
 */
public class QueueByStack {

    private Stack<SingleNode> inputStack;
    private Stack<SingleNode> outputStack;

    public QueueByStack() {
        this.inputStack = new Stack<>();
        this.outputStack = new Stack<>();
    }

    public boolean isEmpty() {

        return (this.inputStack.size() == 0 && this.outputStack.size() == 0);
    }

    private void shiftStacks() {

        if(this.outputStack.isEmpty()) {
            while(!this.inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }

    public int front() {
        shiftStacks();
        return this.outputStack.peek().getData();
    }

    public SingleNode dequeue() {
        shiftStacks();
        return this.outputStack.pop();
    }

    public void enqueu(SingleNode newNode) {
        this.inputStack.push(newNode);
    }
}
