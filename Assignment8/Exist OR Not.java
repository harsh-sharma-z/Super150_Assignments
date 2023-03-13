import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            HashMap<Integer,Integer> uwu=new HashMap<>();

            for(int i=0;i<n;i++)
            {
                uwu.put(a[i],uwu.getOrDefault(a[i],0)+1);
            }
            int k=sc.nextInt();

            while(k-->0)
            {
                int q=sc.nextInt();
                if(uwu.getOrDefault(q,0)!=0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
