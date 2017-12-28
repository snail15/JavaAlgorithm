package MadeForJava.Queue;

import MadeForJava.LinkedList.SingleNode;

/**
 * Created by sunginjung on 12/28/17.
 */
public class app {

    public static void main(String[] args) {

        SingleNode node1 = new SingleNode(1);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(3);
        SingleNode node4 = new SingleNode(4);


        Queue queue = new Queue();

        System.out.println(queue.isEmpty());

        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.front());


        queue.enqueue(node3);
        queue = queue.reverse();
        System.out.println(queue.front());

    }
}
