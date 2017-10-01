package LinkedList;

import java.util.Stack;

/**
 * Created by sunginjung on 9/30/17.
 */
public class App {

    public static void main(String[] args) {

       DoublyLinkedList dl = new DoublyLinkedList();


        dl.insertFirst(0);
        dl.insertFirst(0);
        dl.insertFirst(1);
        dl.insertFirst(1);
        dl.insertFirst(1);
        dl.insertFirst(1);
        dl.insertFirst(0);
        dl.insertFirst(0);
        dl.displayList();
        System.out.println();

        System.out.println(dl.isPalindrome());
    }
}
