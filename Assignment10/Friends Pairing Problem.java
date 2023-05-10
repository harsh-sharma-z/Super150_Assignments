
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            System.out.println(help(n));
        }
    }
    private static long help(int n)
    {
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }


}


