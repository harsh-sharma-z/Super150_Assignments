import java.util.*;
public class Main {
   public static void main (String []args) {

        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        LinkedList<Integer> even=new LinkedList<>();
        LinkedList<Integer> odd=new LinkedList<>();
        for(Integer i:list)
            if(i%2==0) even.add(i);
            else odd.add(i);

            odd.addAll(even);

             for(Integer i:odd)
                System.out.print(i+" ");

    }
}
