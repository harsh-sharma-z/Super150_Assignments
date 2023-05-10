import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        int n= sc.nextInt();
        int coin[]=new int[n];
        for(int i=0;i<n;i++)
            coin[i]=sc.nextInt();
        System.out.println(changeBU(coin,amt));
    }
    private static int changeBU(int[] coin,int amount)
    {
        int[][] dp=new int[coin.length+1][amount+1];
        for(int i=0;i<dp.length;i++)
            dp[i][0]=1;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int inc=0,exc=0;
                if(coin[i-1]<=j)
                {
                    inc=dp[i][j-coin[i-1]];
                }
                exc=dp[i-1][j];
                dp[i][j]=inc+exc;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}


