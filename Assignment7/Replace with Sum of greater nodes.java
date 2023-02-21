import java.util.*;
public class Main {

    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public Main(int[] in)
    {
        this.root=CreateTree(in,0,in.length-1);
    }
    public Node CreateTree(int[] in,int si,int ei)
    {
        if(si>ei)
            return null;
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left= CreateTree(in,si,mid-1);
        nn.right=CreateTree(in,mid+1,ei);
        return nn;
    }
    public void preOrder()
    {
        this.preOrder(this.root);
    }
    private void preOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int in[]=new int[n];
        for(int i=0;i<n;i++)
            in[i]=sc.nextInt();
        Main bst=new Main(in);

        bst.modifyBST(bst.root);
        bst.preOrder();
    }
    void modifyBSTUtil(Node node, Sum S)
    {
        if (node == null)
            return;

        this.modifyBSTUtil(node.right, S);

        S.sum = S.sum + node.val;
        node.val = S.sum;

        this.modifyBSTUtil(node.left, S);
    }

    void modifyBST(Node node)
    {
        Sum S = new Sum();
        this.modifyBSTUtil(root, S);
    }
    public class Sum {
        int sum = 0;
    }
}
