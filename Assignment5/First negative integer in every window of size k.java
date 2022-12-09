import java.util.*;
public class Main {
    

	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0)
        {

            int n=sc.nextInt();
            int a=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            Deque<Integer> uwu=new LinkedList<>();

            int i=0;
            while(i<arr.length)
            {

                if(arr[i]<0)
                    uwu.add(arr[i]);

                if(i+1>=a)
                {

                    if(uwu.isEmpty())
                        System.out.print(0+" ");

                    else
                    {

                        if(i-a>=0 && arr[i-a] == uwu.peek())
                            uwu.remove();

                        if(uwu.isEmpty())
                            System.out.print(0+" ");

                        else
                            System.out.print(uwu.peek()+" ");
                    }


                }

                i++;

            }

            System.out.println();

        }
    }
}
