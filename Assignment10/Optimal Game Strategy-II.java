import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(help(arr,n));

//        }
    }
    private static long help(int arr[],int n) {
        long dp[][]=new long[n][n];

        for (int i = 0; i < n; i++) {

            dp[i][i]=arr[i];

        }

        for (int g = 0; g <dp.length ; g++) {

            for (int i = 0,j=g; j <dp.length ; j++,i++) {

                if(g==0){

                    dp[i][j]=arr[i];

                }else if(g==1){

                    dp[i][j]=Math.max(arr[i],arr[j]);

                }else{

                    long val1=arr[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);

                    long val2=arr[j]+Math.min(dp[i][j-2],dp[i+1][j-1]);

                    long val=Math.max(val2,val1);

                    dp[i][j]=val;

                }

            }

        }

        return dp[0][n-1];
    }
}


