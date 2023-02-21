import java.util.*;
public class Main {
    Scanner scn = new Scanner(System.in);
    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
            Node(int val){
                this.data = val;
            }
        }

        Node root;

        public BinaryTree() {
            this.root = this.takeInput();
        }
        

        private void print(List<List<Integer>> res){
            for(int i=res.size()-1;i>=0;i--)
            {
                for(int j : res.get(i))
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }

        public void levelOrderNewLine() {
            if(root==null){
                return;
            }
            Queue<Node> uwu = new LinkedList<>();
            Queue<Node> temp = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            uwu.add(root);
            while (!uwu.isEmpty()){
                Node node = uwu.remove();
                list.add(node.data);
                if(node.left!=null){
                    temp.add(node.left);
                }
                if(node.right!=null){
                    temp.add(node.right);
                }
                if(uwu.isEmpty()){
                    uwu = temp;
                    temp = new LinkedList<>();
                    res.add(list);
                    list = new ArrayList<>();
                }
            }
            print(res);
        }

        public Node takeInput() {
            String string = scn.nextLine();

            String[] l = string.split(" ");

            int i = 1;
            String val = l[0];
            Node nde = null;
            if(!val.equals("N")){
                nde = new Node(Integer.parseInt(val));
            }
            
            
            Queue<Node> q = new LinkedList<>();
            Node curr = null;
            boolean lft = true;
            q.add(nde);
            while (i<l.length){
                Node node = null;
                String d = l[i];
                i++;
                if(!d.equals("N")){
                    node = new Node(Integer.parseInt(d));
                    q.add(node);
                }
                if(lft){
                    curr = q.remove();
                    curr.left = node;
                    lft = false;
                }
                else{
                    curr.right = node;
                    lft = true;
                }
            }
            return nde;
        }


    }

    public static void main(String[] args) {
        Main harsh = new Main();
        BinaryTree oni = harsh.new BinaryTree();
        oni.levelOrderNewLine();
    }
}
