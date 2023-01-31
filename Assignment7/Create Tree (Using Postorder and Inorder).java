import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
			Node (int data)
			{
				this.data=data;
			}
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
			for (int i=0;i<in.length;++i)
				hm.put(in[i], i);
			this.root = construct(post, 0, post.length - 1, in, 0, in.length - 1,hm);
		}

		private Node construct( int[] postorder, int ps, int pe,int[] inorder, int is, int ie, HashMap<Integer,Integer> hm){
	if (ps>pe || is>ie) return null;
	Node root = new Node(postorder[pe]);
	int ri = hm.get(postorder[pe]);
	Node leftchild = construct(postorder, ps, ps+ri-is-1,inorder, is, ri-1,  hm);
	Node rightchild = construct(postorder, ps+ri-is, pe-1,inorder,ri+1, ie,  hm);
	root.left = leftchild;
	root.right = rightchild;
	return root;
}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
