package MadeForJava.LinkedList;

/**
 * Created by sunginjung on 12/19/17.
 */
public class app {

    public static void main(String[] args) {

        SingleNode node1 = new SingleNode(1);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(3);
        SingleNode node4 = new SingleNode(4);
        SingleNode node5 = new SingleNode(5);


        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
//        node5.setNext(node1);

//        SingleNode nthNode = nthLast(node1, 5);
//        System.out.println("Nth Last: " + nthNode.getData());
        System.out.println(isCycle(node3));

//        DoubleNode node4 = new DoubleNode(4);
//        DoubleNode node5 = new DoubleNode(6);
//        DoubleNode node6 = new DoubleNode(9);
//
//        node4.setNext(node5);
//        node5.setPrevious(node4);
//
//        System.out.println(node4.getData());
//        System.out.println(node4.getNext().getData());
//
//
//        node6 = insertDoubleNode(node4, node6, 2);
//        System.out.println(node4.getNext().getNext().getData());



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

    private static int getLength(DoubleNode head) {

        int length = 0;
        DoubleNode current = head;
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
        if (position > size || position < 0) {
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

            SingleNode nodeToBeDeleted = previous.getNext();
            previous.setNext(nodeToBeDeleted.getNext());
        }
        return head;
    }

    private static DoubleNode insertDoubleNode(DoubleNode head, DoubleNode nodeToInsert, int position) {

        if (head == null) {
            return nodeToInsert;
        }

        int size = getLength(head);
        if (position > size || position < 0) {
            System.out.println("Invalid index position");
        }

        if (position == 0) {
            nodeToInsert.setNext(head);
            head.setPrevious(nodeToInsert);
            return nodeToInsert;
        } else {
            int count = 0;
            DoubleNode previous = head;
            while (count < position - 1) {
                previous = previous.getNext();
                count++;
            }

            DoubleNode current = previous.getNext();
            nodeToInsert.setNext(current);
            nodeToInsert.setPrevious(previous);

            if (current != null) {
                current.setPrevious(nodeToInsert);

            }

            previous.setNext(nodeToInsert);

        }

        return nodeToInsert;
    }

    private static void deleteDoubleNode(DoubleNode head, int position) {

        if (head == null) {
            System.out.println("Empty Node");
        }

        int size = getLength(head);

        if(position < 0  || position > size) {
            System.out.println("Invalid index");
        }

        int count = 0;
        DoubleNode previous = head;
        while(count < position - 1) {
            previous = previous.getNext();
            count++;
        }

        DoubleNode nodeToBeDeleted = previous.getNext();
        DoubleNode newNextNode = nodeToBeDeleted.getNext();
        previous.setNext(nodeToBeDeleted.getNext());

        if(newNextNode != null) {
            newNextNode.setPrevious(previous);
        }

    }

    private static SingleNode nthLast(SingleNode head, int n) {

        SingleNode leftPointer = head;
        SingleNode rightPointer = head;

        for(int i = 0; i < n; i++) {
            if(rightPointer == null){
                throw new IndexOutOfBoundsException("Too Short List");
            }
            rightPointer = rightPointer.getNext();
        }

        while(rightPointer != null) {
            rightPointer = rightPointer.getNext();
            leftPointer = leftPointer.getNext();
        }

        return leftPointer;

    }

    private static boolean isCycle(SingleNode head) {

        SingleNode slowRunner = head;
        SingleNode fastRunner = head;

        while(slowRunner != null && fastRunner != null) {

            fastRunner = fastRunner.getNext();
            if(fastRunner == slowRunner) {
                return true;
            } else if(fastRunner == null) {
                return false;
            }

            fastRunner = fastRunner.getNext();
            if(fastRunner == slowRunner) {
                return true;
            }

            slowRunner = slowRunner.getNext();
        }

        return false;
    }

}