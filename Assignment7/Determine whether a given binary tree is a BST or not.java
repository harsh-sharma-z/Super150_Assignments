import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Main {
    static class BSTfromLevel {
        private Scanner scn = new Scanner(System.in);
        private class Node {
            int val;
            Node left;
            Node right;

            public Node(int val) {
                this.val = val;
            }
        }
        private Node root;
        public BSTfromLevel() {
            root = createTree();// 2k
        }
        public boolean checkValid(Node root, Integer low, Integer high) {
            if (root == null) {
                return true;
            }
            if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
                return false;
            }
            return checkValid(root.right, root.val, high) && checkValid(root.left, low, root.val);
        }
        private Node createTree() {
            int val = scn.nextInt();
            Node nn = new Node(val);
            Queue<Node> queueuwu = new LinkedList<>();
            queueuwu.add(nn);

            while (!queueuwu.isEmpty()) {
                Node front = queueuwu.remove();
                int first = scn.nextInt();
                int second = scn.nextInt();

                if (first != -1) {
                    Node tempfirst = new Node(first);
                    front.left = tempfirst;
                    queueuwu.add(tempfirst);
                }

                if (second != -1) {
                    Node tempsecond = new Node(second);
                    front.right = tempsecond;
                    queueuwu.add(tempsecond);
                }
            }
            return nn;
        }
    }

    public static void main(String[] args) {
        BSTfromLevel uwu = new BSTfromLevel();
        System.out.println(uwu.checkValid(uwu.root,null,null));
    }
}
