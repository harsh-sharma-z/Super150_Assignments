

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
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        while (h-- > 0) {
            int n = sc.nextInt();
            int l=sc.nextInt();
            int s=sc.nextInt();
            HashMap<Integer, Integer> ladder=new HashMap<>();
            HashMap<Integer,Integer> snakes=new HashMap<>();
            for(int i=0;i<l;i++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                ladder.put(u,v);
            }
            for(int i=0;i<s;i++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                snakes.put(u,v);
            }
            int moves=0;
            Queue<Integer> uwu=new LinkedList<>();
            uwu.add(1);
            boolean found=false;
            boolean[] vis= new boolean[n+1];
            Arrays.fill(vis,false);
            vis[1]=true;
            while(!uwu.isEmpty() && !found)
            {
                int size=uwu.size();
                while(size-->0)
                {
                    int t=uwu.poll();
                    for(int i=0;i<6;i++)
                    {
                        if(t+i==n)
                        {
                            found=true;

                        }

                        if(t+i<=n && ladder.containsKey(t+i) && !vis[t+i])
                        {
                            vis[ladder.get(t+i)]=true;
                            if(ladder.get(t+i)==100)
                                found=true;

                            uwu.add(ladder.get(i+t));
                        }
                        else if(t+i<=n && snakes.containsKey(t+i) && !vis[t+i])
                        {
                            vis[snakes.get(t+i)]=true;

                            if(snakes.get(t+i)==100)
                                found=true;
                            uwu.add(snakes.get(t+i));

                        }
                        else if(t+i<=n && !vis[t+i] && !ladder.containsKey(t+i) && !snakes.containsKey(t+i))
                        {
                            vis[t+i]=true;
                            uwu.add(t+i);
                        }

                    }
                }
                moves++;
            }
            if(found)
                System.out.println(moves);
            else System.out.println("-1");
        }
    }
}


