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


        private boolean printFun(Node root){
            if(root==null) return true;
    return isSame(root.left,root.right);
        }
        private boolean isSame(Node p, Node q) {
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    return (p.data==q.data) && isSame(p.left,q.right) && isSame(p.right,q.left);
        
    }
      
    }

    public static void main(String[] args) {
        Main obj = new Main();
        BinaryTree b = obj.new BinaryTree();
        boolean a=b.printFun(b.root);
        if(a)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
