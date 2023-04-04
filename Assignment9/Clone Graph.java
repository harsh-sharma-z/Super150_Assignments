import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class Main {
    public static Node cloneGraph(Node root) {
		if (root == null) return null;
  
  // use a queue to help BFS
  Queue<Node> queue = new LinkedList<Node>();
  queue.add(root);
  
  // use a map to save cloned nodes
  Map<Node, Node> map = new HashMap<Node, Node>();
  
  // clone the root
  map.put(root, new Node(root.val));
  
  while (!queue.isEmpty()) {
    Node node = queue.poll();
    
    // handle the neighbors
    for (Node neighbor : node.neighbors) {
      if (!map.containsKey(neighbor)) {
        // clone the neighbor
        map.put(neighbor, new Node(neighbor.val));
        // add it to the next level
        queue.add(neighbor);
      }
      
      // copy the neighbor
      map.get(node).neighbors.add(map.get(neighbor));
    }
  }
  
  return map.get(root);
       // write code here 
    }
    public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt(); // number of nodes in graph
        Node [] nodes = new Node[n];
        for(int i = 0 ;i<n;i++){
            nodes[i]= new Node(i+1);
        }
        for(int i = 0;i<n;i++){
            int m = s.nextInt(); //num of neighbors connected with ith node
            while(m-->0){
                nodes[i].neighbors.add(nodes[s.nextInt()-1]); // connecting neighbours
            }
        }
        //printing graph
        System.out.print("Original graph :- ");
        get(nodes[0],n);           // original graph
        System.out.println();
        System.out.print("Copied graph :- ");
        Node output = cloneGraph(nodes[0]);
        get(output,n);            // coppied graph
        
    }

    public static void get(Node output ,int n){

        boolean [] visited = new boolean [n];
        Queue<Node> queue =  new LinkedList<>();
        queue.add(output);
        visited[output.val-1]=true;
        while(!queue.isEmpty()){
            Node x = queue.poll();
            System.out.print(x.val+" ");
            if(x.neighbors!=null){
                for(Node curr : x.neighbors){
                    if(!visited[curr.val-1]){
                        queue.add(curr);
                        visited[curr.val-1]=true;
                    }
                }
            }
        }
    }

    
}
