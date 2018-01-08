package MadeForJava.BinarySearchTree;

/**
 * Created by sunginjung on 1/8/18.
 */
public class BinarySearchTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(4);

        root.setLeft(n1);
        root.setRight(n2);

        System.out.println(find(root, 4));
    }

    public static boolean find(TreeNode root, int data) {
        TreeNode current = root;

        while(current != null) {
            if(current.getData() == data) {
                return true;
            }else if(current.getData() > data) {
                current = current.getLeft();
            }else {
                current = current.getRight();
            }
        }

        return false;
    }
}
