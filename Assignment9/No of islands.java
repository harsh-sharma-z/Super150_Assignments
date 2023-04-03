

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
        int m=sc.nextInt();
        int n=sc.nextInt();
        char grid[][]=new char[m][n];

        for(int i =0;i<m;i++)
        {
            String s=sc.next();
            for(int j=0;j<n;j++)
            {
                grid[i][j]=s.charAt(j);
            }
        }
        boolean vis[][]=new boolean[m][n];
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    help(i,j,grid, vis);
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    private static void help(int i, int j, char[][] grid,boolean vis[][] )
    {
        if(i<0 || i>=grid.length)
            return;
        if(j<0 || j>=grid[0].length)
            return;

        if(grid[i][j]!='1' || vis[i][j])
            return;

        vis[i][j]=true;

        help(i-1,j,grid,vis);
        help(i+1,j,grid,vis);
        help(i,j+1,grid,vis);
        help(i,j-1,grid,vis);


    }
}


