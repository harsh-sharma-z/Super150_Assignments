import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.reverseLevel();
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

	public void reverseLevel() {
			Queue<Node> q = new LinkedList<>();
               Stack<Node> s = new Stack<>();
               q.add(root);
               while(!q.isEmpty()){
                    Node temp = q.remove();
                    s.push(temp);
                    if(temp.right!=null) q.add(temp.right);
                    if(temp.left!=null) q.add(temp.left);
               }
               while(!s.isEmpty()) System.out.print(s.pop().data+" ");
		}


	}

}
