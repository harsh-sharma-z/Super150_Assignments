import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			// write your code here
			List<List<Integer>> ans=(this.levelOrderNewLine(this.root));
			for(List<Integer> i: ans)
			{
				for(Integer j: i)
				System.out.print(j+" ");
				System.out.println("");
			}
		}

		public List<List<Integer>> levelOrderNewLine(Node root)
		{
			Queue<Node> q=new LinkedList<>();
        Queue<Node> q1=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
               if(root==null)
                return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            Node rv=q.remove();
            ll.add(rv.data);
            if(rv.left!=null)
                q1.add(rv.left);
            if(rv.right!=null)
                q1.add(rv.right);
            if(q.isEmpty())
            {
                ans.add(ll);
                ll=new ArrayList<Integer>();
                q=q1;
                q1=new LinkedList<>();
            }
        }
        return ans;

		}

	}

}
