

import java.util.*;
import java.io.*;

class Main {
//     static class Pair{
//
//        int parent;
//        int node;
//
//        public Pair( int node, int parent){
//            this.parent=parent;
//            this.node=node;
//        }
//    }

//    private static int[] dr={-1,0,1,0};
//    private static int[] dc={0,1,0,-1};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        while (h-- > 0)
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(int i=0;i<n;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        if(checkBipartite(adj,n))
            System.out.println("1");
        else
            System.out.println("0");

    }

    private static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj , int n)
    {
        int color[]= new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(!bfs(adj,i,color))
                    return false;
            }
        }
        return true;
    }

    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int index , int[] color)
    {
        color[index]=0;
        Queue<Integer> uwu=new LinkedList<>();
        uwu.add(index);

        while(!uwu.isEmpty())
        {
            int node=uwu.poll();
            for(int i: adj.get(node))
            {

                if(color[i]==-1)
                {
                    color[i]=1-color[node];
                    uwu.add(i);
                }
                else {
                    if(color[i]==color[node])
                        return false;
                }
            }
        }
        return true;
    }
}


