import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
            return isBalanced(root).bool;
		}

		private Pair isBalanced(Node node) {
			// write your code here
            Pair p = new Pair();
            if(node==null)
            {
                return p;
            }
            Pair l=isBalanced(node.left);
            Pair r=isBalanced(node.right);

            p.bool=Math.abs(l.h-r.h)<=1;
            p.h=Math.max(l.h,r.h)+1;

            return p;
			
		}

		private class Pair {
			int h=-1;
			boolean bool=true;
		}

	}
}
