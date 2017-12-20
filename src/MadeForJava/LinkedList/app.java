package MadeForJava.LinkedList;

/**
 * Created by sunginjung on 12/19/17.
 */
public class app {

    public static void main(String[] args) {

        SingleNode node1 = new SingleNode(1);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(5);

        node1.setNext(node3);
        System.out.println(node1.getNext().getData());

        node2 = insertNode(node1, node2, 1);
        System.out.println(node1.getNext().getData());

        node1 = deleteNode(node1, 1);
        System.out.println(node1.getNext().getData());


    }

    private static int getLength(SingleNode head) {

        int length = 0;
        SingleNode current = head;
        while(current != null) {
            length++;
            current = current.getNext();
        }

        return length;
    }

    private static SingleNode insertNode(SingleNode head, SingleNode nodeToInsert, int position) {

        if (head == null) {
            return nodeToInsert;
        }

        int size = getLength(head);
        if (position < 0 || position > size) {
            System.out.println("Invalid index position");
            return head;
        }

        if (position == 0) {
            nodeToInsert.setNext(head);
            return nodeToInsert;
        } else {
            SingleNode previous = head;
            int count = 0;
            while (count < position - 1) {
                previous = previous.getNext();
                count++;
            }

            SingleNode current = previous.getNext();
            nodeToInsert.setNext(current);
            previous.setNext(nodeToInsert);
        }

        return nodeToInsert;
    }

    private static SingleNode deleteNode(SingleNode head, int position) {

        int size = getLength(head);
        if (position > size - 1 || position < 0) {
            System.out.println("Invalid index position");
        }

        if (position == 0) {
            SingleNode current = head.getNext();
            head = null;
            return current;

        } else {
            int count = 0;
            SingleNode previous = head;
            while (count < position - 1) {
                previous = previous.getNext();
                count++;
            }
            previous.setNext(previous.getNext().getNext());
        }
        return head;
    }

}