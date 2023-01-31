import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		int a=scn.nextInt();
		int b=scn.nextInt();
		bt.sibling( a, b);
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

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void sibling(int a,int b) {
			Node aa=search(root,a);
			Node bb=search(root,b);
			Node temp=this.sibling(this.root, aa, bb);
			System.out.println(temp.data);
		}

		private Node sibling(Node root,Node p,Node q) {
			// write your code here
			if(root==null) return root;
        if(root==p || root==q) return root;
        Node left=sibling(root.left,p,q);
        Node right=sibling(root.right,p,q);
        if(left!=null && right!=null) return root;
        else if(left!=null) return left;
        else return right;
			
		}

		private Node search (Node root,int item)
		{
				if(root==null)
				return null;
				if(root.data==item)
				return root;
				Node l = search(root.left,item);
				Node r = search(root.right,item);
				return l!=null ? l : r;
		}

	}

}
