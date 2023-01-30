import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			levelOrderZZ(this.root);
			// write your code here
		}
		private void levelOrderZZ(Node root)
		{
			int h=height(root);
    		for(int i=0;i<h;i++)
    			{
        			if(i%2==0)
        			{
            			kthlevel(root,i);
    
        			}
        			else if(i%2!=0)
        			{
          				kthlevel1(root,i);
          
       				}
    			}
		}
		int height(Node root)
		{
    		if(root==null)
    		{
       		 return 0;
    		}
    	int lh=height(root.left);
    	int rh=height(root.right);
    	return Math.max(lh,rh)+1;
		}
		void kthlevel(Node root,int k)
{
    if(root==null)
    {
        return;
    }

    if(k==0)
    {
     
		System.out.print(root.data+" ");
    }
    kthlevel(root.left,k-1);
    kthlevel(root.right,k-1);
}
void kthlevel1(Node root,int k)
{
    if(root==null)
    {
        return;
    }

    if(k==0)
    {
		System.out.print(root.data+" ");
    }
    kthlevel1(root.right,k-1);
    kthlevel1(root.left,k-1);
}

	}

}
