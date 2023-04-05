import java.lang.reflect.Array;
import java.util.*;
public class Main {
    private static long[] par;

    private static int find(int i)
    {
        if(par[i]==-1)
            return (int) (par[i]=i);
        if(par[i]==i)
            return i;
        return (int) (par[i]=find((int) par[i]));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();

            par=new long[(int) (n+1)];
            Arrays.fill(par,-1);
            long[] size=new long[(int) (n+1)];
            Arrays.fill(size,1);

            for(int i=0;i<m;i++)
            {

                int f=sc.nextInt();
                int g=sc.nextInt();
                int u=find(f);
                int v=find(g);
                if(u!=v)
                {
                    if(size[v]>size[u])
                        swap(size,u,v);


                    par[v]=u;
                    size[u]+=size[v];

                }
            }

            long ans=0;
            for(int i=1;i<=n;i++)
            {
                long u=size[find(i)];
                if(u!=0)
                {
                    ans+=a+(u-1)*b;

                    size[find(i)]=0;
                }
            }

            System.out.println(Math.min(a*n, ans));

        }
    }
    private static void swap(long arr[], int a , int b)
    {
        long temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
