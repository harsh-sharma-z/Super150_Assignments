
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
        long[] dp = new long[10000+1];
        dp[1] = 1;
        int factor2 = 1;
        int factor3 = 1;
        int factor5 = 1;
        for (int i = 2; i <= 10000; i++) {
            long agla2 = dp[factor2] * 2;
            long agla3 = dp[factor3] * 3;
            long agla5 = dp[factor5] * 5;
            dp[i] = Math.min(agla2, Math.min(agla3, agla5));
            if (dp[i] == agla2)
                factor2++;
            if (dp[i] == agla3)
                factor3++;
            if (dp[i] == agla5)
                factor5++;
        }
        return dp[n];
    }


}


