import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		int k=scn.nextInt();
		bt.help(k);
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
		
		public void help(int k) {
			 this.help(this.root, k,new ArrayList<>()) ;
		}
		
		private void help(Node node,int k, ArrayList<Integer> uwu) {
			if(node==null)
                return;
            if(k-node.data==0 && node.left==null && node.right==null)
            {
                for(Integer i: uwu)
                    System.out.print(i+" ");
                System.out.print(node.data);
                return;
            }


            uwu.add(node.data);
            help(node.left,k-node.data,uwu);
            help(node.right,k-node.data,uwu);
            uwu.remove(uwu.size()-1);
		}
	}
}
