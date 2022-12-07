import java.util.*;
public class Main {
	public static Stack<Integer> s1=new Stack<>();
	public static Stack<Integer> s2=new Stack<>();
	public static void enq(int a)
	{
		s1.push(a);
	}
	public static int deq()
	{
		if(s2.size()==0)
		{
			if(s1.size()==0)
			return -1;
		}
		while(s1.size()>0)
		{
			int p=s1.pop();
			s2.push(p);
		}
		return s2.pop();
	}
	
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			enq(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(deq()+" ");
		}
    }
}
