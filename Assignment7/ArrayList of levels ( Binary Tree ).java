import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			return levelArrayList(this.root);
			// write your code here
		}
		private ArrayList<ArrayList<Integer>> levelArrayList(Node root)
		{
			Queue<Node>	 queue=new LinkedList<>();
			ArrayList<ArrayList<Integer>> wrapList=new ArrayList<>();
			if(root==null) return wrapList;
			queue.offer(root);
			while(!queue.isEmpty())
			{
				int level=queue.size();
				ArrayList<Integer> sub=new ArrayList<>();
				for(int i=0;i<level;i++)
				{
					if(queue.peek().left!=null) 
					queue.offer(queue.peek().left);
					if(queue.peek().right!=null)
					queue.offer(queue.peek().right);
					sub.add(queue.poll().data);
				}
				wrapList.add(sub);
			}
			return wrapList;
		}
	}

}
