package StackQueue;

/**
 * Created by sunginjung on 9/30/17.
 */
public class App {

    public static void main(String[] args) {
//        Stack myStack = new Stack();
//
//        System.out.println(myStack.isEmpty());
//        myStack.peek();
//
//        myStack.push(0);
//        myStack.push(11);
//        myStack.push(22);
//        myStack.push(3);
//
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println("---peek---");
//        myStack.peek();
//        System.out.println(myStack.isEmpty());
//        System.out.println(myStack.min());



        QueueViaStack myQueue = new QueueViaStack();

        System.out.println(myQueue.isEmpty());
        myQueue.add(1);
        myQueue.add(2);
        myQueue.peek();

        myQueue.remove();

        myQueue.add(199);
        myQueue.add(19);

        System.out.println();
        myQueue.peek();
        myQueue.remove();
        System.out.println();
        myQueue.peek();
        myQueue.remove();
        myQueue.peek();

    }
}
