import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();

        HashMap<Long,Integer> uwu=new HashMap<>();
        int max=0;
        long ans=arr[0];
        for(long i:arr)
        {
            uwu.put(i,uwu.getOrDefault(i,0)+1);
            if(uwu.get(i)>max)
            {
                max=uwu.get(i);
                ans=i;
            }
        }

        System.out.println(ans);


    }
}
