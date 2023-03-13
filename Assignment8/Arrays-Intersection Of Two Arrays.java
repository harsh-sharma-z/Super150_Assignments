import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();

        HashMap<Integer,Integer> uwu=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            uwu.put(a[i],uwu.getOrDefault(a[i],0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:b)
        {
            if(uwu.getOrDefault(i,0)!=0)
            {
                ans.add(i);
                uwu.put(i,uwu.get(i)-1);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
