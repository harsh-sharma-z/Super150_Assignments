import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
        int n=sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int N=sc.nextInt();
        System.out.println(help(N,arr));

//        }
    }

    private static int help(int n,int[] price)
    {
        if(n==0)
            return 0;
        if(n==1)
            return price[0];
        int []dp=new int[n+1];
        dp[1]=price[0];
        int l=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=price[i-1];
            for(int j=1;j<i;j++)
            {
                dp[i]=Math.max(dp[i],dp[i-j]+dp[j]);
            }
        }
        return dp[n];
    }
}


