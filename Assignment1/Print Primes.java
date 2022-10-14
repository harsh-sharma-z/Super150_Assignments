// Take N as input. Print all prime numbers from 2 to N.

// Input Format
// Constraints
// 1 <= N <= 1000

// Output Format
// Sample Input
// 10
// Sample Output
// 2
// 3
// 5
// 7
// Explanation
// Each output should be on separate line. A prime number is that number which is divisible by one or itself.
	


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
