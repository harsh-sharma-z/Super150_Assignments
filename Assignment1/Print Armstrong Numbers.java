// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

// Input Format
// Constraints
// 0 < N1 < 100 N1 < N2 < 10000

// Output Format
// Sample Input
// 400
// 1000
// Sample Output
// 407
// Explanation
// Each number in output is in separate line.




import java.util.*;
public class Main {

	public static int arms(int n,int len)
	{
		int num=n;

		int rem, sum=0;

		while(n>0)
		{
			rem=n%10;
			sum+=(int)Math.pow(rem,len);
			n/=10;
		}

		if(num==sum)
		return 1;
		return 0;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();

		for(int i=a;i<=b;i++)
		{
			String s=Integer.toString(i);
			int len=s.length();
			if(arms(i,len)==1)
			System.out.println(i);

		}
        // Your Code Here
    }
}
