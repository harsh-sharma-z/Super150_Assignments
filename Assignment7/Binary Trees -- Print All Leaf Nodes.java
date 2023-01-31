import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data = data;
            }
        }
        Node root;
        public BinaryTree() {
            this.root = this.takeInput();
        }

        public Node takeInput() {
            int data = sc.nextInt();
            Node temp = new Node(data);
            Queue<Node> uwu = new LinkedList<>();
            Node curr = null;
            boolean isLeft = true;
            uwu.add(temp);
            while (!uwu.isEmpty()){
                Node node = null;
                int d = sc.nextInt();
                if(d!=-1){
                    node = new Node(d);
                    uwu.add(node);
                }
                if(isLeft){
                    curr = uwu.remove();
                    curr.left = node;
                    isLeft = false;
                }
                else{
                    curr.right = node;
                    isLeft = true;
                }
            }
            return temp;
        }


        private void printFun(Node root){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                System.out.print(root.data+" ");
            }
            printFun(root.left);
            printFun(root.right);
        }
        private void print(List<Integer> list){
            for(int i: list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        BinaryTree b = obj.new BinaryTree();
        b.printFun(b.root);
    }
}
