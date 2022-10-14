import java.util.*;
public class Main {
	public static void prime(int n)
	{		

			if(n==2)
			{
			System.out.println(n);
			return;
			}
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				return;
			}
			System.out.println(n);
		
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			prime(i);
		}
    }
}
