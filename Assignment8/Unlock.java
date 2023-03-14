import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        int arr[]=new int[n];
        HashMap<Integer,Integer> uwu=new HashMap<>();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            uwu.put(arr[i],i);
        }



        for(int i=0;i<n && k>0;i++)
        {
            int x=n-i;
            if(arr[i]==x)
            continue;

            int idx= uwu.get(x);

            uwu.put(arr[i],idx);

            uwu.put(x,i);

            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            k--;
        }

        for(int i:arr)
            System.out.print(i+" ");
    }
}
