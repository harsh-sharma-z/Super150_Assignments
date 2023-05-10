import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println(maxGold(n,m,arr));
        }
    }
    private static int maxGold(int n, int m, int M[][]){
        int max = Integer.MIN_VALUE;
        int dp [][] = new int [n][m];
        for(int ref[] : dp) Arrays.fill(ref,-1);
        for(int i = 0; i< M.length; i++) max = Math.max(max, form(i,0,M,dp));
        return max;
    }
    private static int form(int r,int c,int M[][],int dp[][]) {
        if (r < 0 || c < 0 || r == M.length || c == M[0].length) return 0;
        if (dp[r][c] > -1) return dp[r][c];
        int right = form(r, c + 1, M, dp);
        int diagru = form(r - 1, c + 1, M, dp);
        int diagrd = form(r + 1, c + 1, M, dp);
        int maxdiag = Math.max(diagru, diagrd);
        return dp[r][c] = Math.max(maxdiag, right) + M[r][c];
    }
}


