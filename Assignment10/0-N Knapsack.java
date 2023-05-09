import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] val=new int[n];
        int[] wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=sc.nextInt();
        for (int i=0;i<n;i++)
            val[i]=sc.nextInt();
        System.out.println(knapSack(n,m,val,wt));
    }
    private static int knapSack(int n, int W, int val[], int wt[])
    {

        int p[] = new int[W+1];
        for(int j=0; j<=W; j++) p[j]= val[0]*(j/wt[0]);

        for(int i=1; i<n; i++){
            for(int j=0; j<=W; j++){
                int noTake = 0 + p[j], take= Integer.MIN_VALUE;

                if(wt[i] <= j) take = val[i] + p[j - wt[i]];
                p[j] = Math.max(take, noTake);
            }
        }

        return p[W];
    }
}


