import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
        int n = sc.nextInt();

//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
        System.out.println(numberOfWays(n));

//        }
    }

    public static long numberOfWays(int n) {
        long dp[]=new long[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		dp[i]=dp[i-1]+dp[i-2];
		return dp[n];
    }
}


