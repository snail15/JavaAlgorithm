package LeetCode;

/**
 * Created by sunginjung on 1/5/18.
 */
public class deleteNodeWithoutHead {

    public static void DeleteNode(ListNode node) {

        if(node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }


    }
}
