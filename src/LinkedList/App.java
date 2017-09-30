package LinkedList;

/**
 * Created by sunginjung on 9/30/17.
 */
public class App {

    public static void main(String[] args) {

        SinglyLinkedList sl = new SinglyLinkedList();

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);

        sl.insertLast(nodeA);
        sl.insertLast(nodeB);
        sl.insertHead(nodeC);
        sl.insertHead(nodeD);
        sl.removeFirst();
        sl.removeFirst();
        sl.removeFirst();
        sl.removeFirst();
        System.out.println(sl.isEmpty());
        sl.displayList();
        System.out.println();
        System.out.println(sl.showSize());
    }
}
