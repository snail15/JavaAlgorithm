package BST;

/**
 * Created by sunginjung on 10/10/17.
 */
public class Node {

    int key;
    String name;

    Node left;
    Node right;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return this.name + " has a key " + this.key;
    }


}
