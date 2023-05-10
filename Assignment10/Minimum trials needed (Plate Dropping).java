import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(plateDrop(n,k));

        }
    }
    public static int plateDrop(int n, int k){
        int dp[][] = new int[n+1][k+1];
        for (int i = 1; i <= n; i++){
            dp[i][1] = 1;
            dp[i][0] = 0;
        }

        for (int j = 1; j <= k; j++){
            dp[1][j] = j;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 2; j <= k; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int x = 1; x <= j; x++){
                    int move = 1 + Math.max(dp[i-1][x-1], dp[i][j-x]);
                    if (move < dp[i][j]){
                        dp[i][j] = move;
                    }
                }
            }
        }

        return dp[n][k];
    }
}


