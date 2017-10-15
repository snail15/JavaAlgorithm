package BST;

/**
 * Created by sunginjung on 10/10/17.
 */
public class isIdentical {

    public static void main(String[] args) {
        BST tree1 = new BST();
        BST tree2 = new BST();

        tree1.addNode(10, "Boss");
        tree1.addNode(20, "VP");
        tree1.addNode(30, "Pres");
        tree1.addNode(40, "Secr");
        tree1.addNode(50, "Intern");
        tree1.addNode(60, "Associate");

        tree2.addNode(10, "Boss");
        tree2.addNode(20, "VP");
        tree2.addNode(30, "Pres");
        tree2.addNode(40, "Secr");
        tree2.addNode(50, "Intern");


        System.out.println(isIdentical(tree1.root, tree2.root));


    }

    public static boolean isIdentical(Node tree1, Node tree2) {


        if(tree1 == null & tree2 == null){

            return true;
        }

        if(tree1 != null && tree2 != null){
            return ((tree1.key == tree2.key) &&
                    isIdentical(tree1.left, tree2.left) &&
                    isIdentical(tree1.right, tree2.right));
        }


        return false;
    }
}
