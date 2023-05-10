
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(help(n));

    }

   private static long help(int n)
   {
       long [] dp = new long[n+1];
       dp[0] = 1;
       for (int i = 1; i <= n; i++) {
           if(i-1>=0){
               dp[i] += dp[i-1];
           }
           if(i-3>=0){
               dp[i] += dp[i-3];
           }
           if(i-4>=0){
               dp[i] += dp[i-4];
           }

       }
       return dp[n];
   }
}


