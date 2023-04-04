

import java.util.*;
import java.io.*;

class Main {


//    private static int[] dr={-1,0,1,0};
//    private static int[] dc={0,1,0,-1};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        while (h-- > 0)

            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] grid=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    grid[i][j]=sc.nextInt();
                }
            }
        System.out.println(maxRect(n,m,grid));
    }

    private static int helper(int n, int m, int grid[])
    {
        Stack<Integer> uwu = new Stack<Integer>();
        int top;
        int max_area = 0;
        int area = 0;
        int i = 0;
        while (i < m) {
            if (uwu.empty()|| grid[uwu.peek()] <= grid[i])
                uwu.push(i++);
            else {
                top = grid[uwu.pop()];
                area = top * i;
                if (!uwu.empty())
                    area = top * (i - uwu.peek() - 1);
                max_area = Math.max(area, max_area);
            }
        }
        while (!uwu.empty()) {
            top = grid[uwu.peek()];
            uwu.pop();
            area = top * i;
            if (!uwu.empty())
                area = top * (i - uwu.peek() - 1);
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
    private static int maxRect(int n, int m, int grid[][])
    {
        int res = helper(n, m, grid[0]);
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < m; j++)

                if (grid[i][j] == 1)
                    grid[i][j] += grid[i - 1][j];
            res = Math.max(res, helper(n, m, grid[i]));
        }
        return res;
    }

}


