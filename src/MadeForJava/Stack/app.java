package MadeForJava.Stack;

/**
 * Created by sunginjung on 12/27/17.
 */
public class app {

    public static void main(String[] args) {

        StackNode node1 = new StackNode(1);
        StackNode node2 = new StackNode(2);
        StackNode node3 = new StackNode(3);
        StackNode node4 = new StackNode(4);

        MyStack stack = new MyStack();

        System.out.println(stack.isEmpty());
        stack.push(node1);
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
        stack.push(node2);
        System.out.println(stack.top());
        stack.push(node3);
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
