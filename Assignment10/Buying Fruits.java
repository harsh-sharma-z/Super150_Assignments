import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int aee[][]=new int[n][3];
            for(int i=0;i<n;i++)
                for(int j=0;j<3;j++)
                    aee[i][j]=sc.nextInt();
            System.out.println(minCost(n,aee));
        }

    }
    public static int getMin(int arr[],int l,int h)
    {
        int res=Integer.MAX_VALUE;
        for(int i=l;i<=h;++i)
            if(arr[i]<res)
                res=arr[i];
        return res;
    }
    public static int minCost(int n,int arr[][])
    {
        int dp[][]=new int[n][3];
        for(int i=0;i<3;++i)
            dp[0][i]=arr[0][i];
        for(int i=1;i<n;++i)
        {
            for(int j=0;j<3;++j){
                dp[i][j]=Math.min(getMin(dp[i-1],0,j-1),getMin(dp[i-1],j+1,2))+arr[i][j];

            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<3;++i)
            if(dp[n-1][i]<res)
                res=dp[n-1][i];
        return res;

    }
}


