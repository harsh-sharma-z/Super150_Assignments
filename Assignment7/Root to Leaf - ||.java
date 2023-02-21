import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
    }

public class Main {
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<Node> uwu= new LinkedList<>();
        int t= scn.nextInt();
        Node root = new Node(t);
        uwu.add(root);
        while(!uwu.isEmpty()){
            Node temp = uwu.remove();
            t = scn.nextInt();
            if(t!=-1){
                temp.left = new Node(t);
                uwu.add(temp.left);
            }
            t=scn.nextInt();
            if(t!=-1){
                temp.right = new Node(t);
                uwu.add(temp.right);
            }
        }
		int n = scn.nextInt();
		int c = pathSum(root,n);
        System.out.print(c);
	}

	
    public static int pathSum(Node root, int k) {
        if(root==null) return 0;
        k-=root.data;
        if(root.left==null && root.right==null && k==0) return 1;
    
        int l = pathSum(root.left, k);
        int r = pathSum(root.right, k);
        
        return l+r;
    }
}
