

import java.util.*;
import java.io.*;

class Main {
     static class Pair{

        int x;
        int y;

        public Pair( int x, int y){
            this.x=x;
            this.y=y;
        }
    }

//    private static int[] dr={-1,0,1,0};
//    private static int[] dc={0,1,0,-1};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        while (h-- > 0)
        {
            int n=sc.nextInt();
            int grid[][]=new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    grid[i][j]=sc.nextInt();
            int vis[][]=new int[n][n];
            int ans=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(vis[i][j]==0 && grid[i][j]==1)
                    {
                        bfs(grid,vis,i,j,n);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    private static void bfs(int[][] grid , int[][] vis, int i , int j, int n)
    {
        vis[i][j]=1;
        Queue<Pair> uwu=new LinkedList<>();
        uwu.add(new Pair(i,j));
        while(!uwu.isEmpty())
        {
            int row=uwu.peek().x;
            int col=uwu.peek().y;
            uwu.poll();
            for(int delrow=-1;delrow<=1;delrow++)
            {
                for(int delcol=-1 ; delcol<=1; delcol++)
                {
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
                    {
                        vis[nrow][ncol]=1;
                        uwu.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }
}


