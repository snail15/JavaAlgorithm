package LinkedList;

/**
 * Created by sunginjung on 9/30/17.
 */
public class App {

    public static void main(String[] args) {

       DoublyLinkedList dl = new DoublyLinkedList();


       dl.insertLast(10);

        dl.insertFirst(1);


        dl.insertFirst(2);
        dl.insertFirst(4);
        dl.insertFirst(7);
        dl.insertFirst(0);
        dl.insertFirst(200);
        dl.insertLast(1000);
        dl.insertFirst(2000);
        dl.deleteFirst();
        dl.deleteLast();
        dl.delete(1);
        dl.insertAfter(1, 234);
        dl.displayList();
    }
}
