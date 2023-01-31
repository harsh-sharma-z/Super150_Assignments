import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.sumOfNodes());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {
			String s=scn.next();
            if(!s.equals("NULL"))
            {

                Node node=new Node();
                node.data=Integer.parseInt(s);
                node.left=takeInput(node,true);
                node.right=takeInput(node,false);
                return node;
            }
            return null;

		}
        
		public int sumOfNodes() {
			 this.sumOfNodes(this.root) ;
             return res; 
		}
		private int res=0;
		private int sumOfNodes(Node node) {
			if(node==null)
			{
                return 0;
            }
			int left=sumOfNodes(node.left);
            int right=sumOfNodes(node.right);
            int max=Math.max(node.data,Math.max(node.data+left,Math.max(node.data+right,node.data+left+right)));
			// write your code here
			res=Math.max(res,max);

            return node.data>node.data+Math.max(left,right)?node.data:node.data+Math.max(left,right);
		}
	}
}
