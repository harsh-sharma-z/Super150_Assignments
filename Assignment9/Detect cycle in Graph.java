

import java.util.*;
import java.io.*;

class Main {

     static class Pair{

        int parent;
        int node;

        public Pair( int node, int parent){
            this.parent=parent;
            this.node=node;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                adj.add(new ArrayList<Integer>());
            }

            int edge=sc.nextInt();
            while(edge-->0)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();

                u--;
                v--;
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

//            int src=sc.nextInt();
//            src--;
            boolean vis[]= new boolean[n];
            boolean ans=false;
            Arrays.fill(vis,false);
            for(int i=0;i<n;i++)
            {
                if(vis[i]==false)
                    if(check(i,n,adj,vis))
                    ans=true;
                    
            }
            if(ans)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

    private static boolean check(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[])
    {
        vis[src]=true;
        Queue<Pair> uwu=new LinkedList<>();

        uwu.add(new Pair(src,-1));
        while(!uwu.isEmpty())
        {
            int node=uwu.peek().node;
            int parent=uwu.peek().parent;
            uwu.poll();

            for(int i: adj.get(node))
            {
                if(vis[i]==false)
                {
                    vis[i]=true;
                    uwu.add(new Pair(i,node));
                }
                else if(parent != i)
                {
                    return true;
                }
            }

        }
        return false;
    }


}
