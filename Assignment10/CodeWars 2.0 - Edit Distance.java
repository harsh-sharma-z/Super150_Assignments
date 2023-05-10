import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
        String a=sc.next();
        String b=sc.next();
        a.trim();
        b.trim();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
        System.out.println(help(a,b));

//        }
    }

    private static int help(String s1, String s2)
    {
        int m=s1.length();
        int n=s2.length();

        int dp[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++)
            dp[i][0]=i;
        for(int i=0;i<=n;i++)
            dp[0][i]=i;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                    dp[i+1][j+1]=dp[i][j];
                else
                {
                    int a =dp[i][j];
                    int b=dp[i+1][j];
                    int c=dp[i][j+1];
                    dp[i+1][j+1]=Math.min(Math.min(a,b),c);
                    dp[i+1][j+1]++;
                }
            }
        }

        return dp[m][n];
    }
}


