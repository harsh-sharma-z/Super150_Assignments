import java.util.*;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        BST bt1 = m.new BST();
        System.out.println(bt1.maxDepth(bt1.root));
    }
    private class BST {
        private class Node {
            int value;
            Node left;
            Node right;
        }
        private Node root;
        private int size;
        public BST() {
            this.root = this.createTree(null, false);
        }
        public int maxdepth(BST other) {
            return this.maxDepth( other.root);
        }
        private int maxDepth(Node node)
        {
            if (node == null)
                return 0;
            else {
                int lDepth = maxDepth(node.left);
                int rDepth = maxDepth(node.right);
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }
        public Node createTree(Node parent, boolean ilc) {
            int cvalue = reader.nextInt();
            Node child = new Node();
            child.value = cvalue;
            this.size++;
            boolean hlc = reader.nextBoolean();
            if (hlc) {
                child.left = this.createTree(child, true);
            }
            boolean hrc = reader.nextBoolean();
            if (hrc) {
                child.right = this.createTree(child, false);
            }
            return child;
        }

    }
}
