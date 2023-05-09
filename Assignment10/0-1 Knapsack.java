import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] val=new int[n];
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=sc.nextInt();
        for (int i=0;i<n;i++)
            val[i]=sc.nextInt();
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(knapSack(m,wt,val,n));
    }
    static int[][] dp = new int[1002][1002];




    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        if(n==0 || W==0){
            return 0;
        }

        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            return dp[n][W]=Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1), knapSack(W, wt, val, n - 1));
        }
        else if(wt[n-1]>W){
            return dp[n][W]=knapSack(W,wt,val,n-1);
        }
        return 0;
    }
}


