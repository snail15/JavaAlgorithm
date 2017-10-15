package BST;

/**
 * Created by sunginjung on 10/10/17.
 */
public class BST {

    Node root;

    public void addNode(int key, String name){

        Node newNode = new Node(key, name);

        if(this.root == null){

            this.root = newNode;

        } else {

            Node current = this.root;

            Node parent;

            while(true) {

                parent = current;

                if( key < current.key) {

                    current = current.left;

                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }

        }

    }

    public void inOrderTraverse(Node startNode){

        if(startNode != null){

            inOrderTraverse(startNode.left);

            System.out.println(startNode);

            inOrderTraverse(startNode.right);

        }
    }
    public void preOrderTraverse(Node startNode){

        if(startNode != null){

            System.out.println(startNode);

            preOrderTraverse(startNode.left);

            preOrderTraverse(startNode.right);

        }
    }

    public Node find(int key){

        Node current = this.root;

        while(current.key != key){

            if(key < current.key){
                current = current.left;
            }else {
                current = current.right;
            }

            if(current == null){
                return null;
            }
        }

        return current;
    }

    public boolean remove(int key){

        Node current = this.root;
        Node parent = this.root;

        boolean isLeft = true;

        while(current.key != key) {

            parent = current;

            if (key < current.key) {

                isLeft = true;
                current = current.left;
            } else {

                isLeft = false;
                current = current.right;
            }

            if (current == null) {
                return false;
            }
        }

        if(current.left == null && current.right == null) {

            if(current == this.root){
                this.root = null;
            } else if(isLeft){
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if(current.right == null){

            if(current == this.root){
                this.root = current.left;
            }else if (isLeft){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        } else if(current.left == null) {

            if(current == this.root){
                this.root = current.right;
            }else if(isLeft){

                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {

            Node replacement = getReplacementNode(current);

            if(current == root) {

                root = replacement;

            }else if(isLeft){
                parent.left = replacement;
            }else{
                parent.right = replacement;
            }

            replacement.left = current.left;

        }

        return true;

    }

    private static Node getReplacementNode(Node replacedNode){

        Node replacementParent = replacedNode;
        Node replacement = replacedNode;

        Node current = replacedNode.right;

        while(current != null){

            replacementParent = replacement;
            replacement = current;
            current = current.left;
        }

        if(replacement != replacedNode.right) {

            replacementParent.left = replacement.right;
            replacement.right = replacedNode.right;
        }

        return replacement;

    }

}
