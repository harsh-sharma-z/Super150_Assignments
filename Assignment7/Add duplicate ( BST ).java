import java.util.*;
public class Main {

    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;


   public void insert(int v)
   {
       this.root=this.insert(this.root,v);

   }

   private Node insert(Node root, int v)
    {
        if(root==null)
        {
            root=new Node();
            root.val=v;
            return root;
        }
        if(v<root.val)
            root.left=insert(root.left,v);
        else
            root.right=insert(root.right,v);

        return root;
    }

   public void duplicate ()
   {
       this.duplicate(this.root);
   }
   private void duplicate(Node root)
   {
        if(root==null)
            return;
        Node temp=root.left;
        root.left=new Node();
        root.left.val=root.val;
        root.left.left=temp;

        if(root.left.left!=null)
            duplicate(root.left.left);
        duplicate(root.right);


   }


   public void display()
   {
       this.display(this.root);
   }

   private void display(Node node)
   {
       if (node == null) {
           return;
       }

       String str = "";

       if (node.left != null) {
           str += node.left.val;
       } else {
           str += "END";
       }

       str += " => " + node.val + " <= ";

       if (node.right != null) {
           str += node.right.val;
       } else {
           str += "END";
       }

       System.out.println(str);

       this.display(node.left);
       this.display(node.right);
   }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        Main bst=new Main();

        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            bst.insert(val);
        }
        bst.duplicate();
        bst.display();
    }
}
