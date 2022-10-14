// Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

// Input Format
// Constraints
// 0 <= N <= 1000

// Output Format
// Sample Input
// 10
// Sample Output
// 55
// Explanation
// The 0th fibonnaci is 0 and 1st fibonnaci is 1.



import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 if(n==0)
	System.out.println("0");
	else{
		int p2=1,p=1,N=Integer.MAX_VALUE;
       for(int i=3;i<=n;i++)
       {
            int curr=(p%N+p2%N)%N;
           p2=p;
           p=curr;
       }
       System.out.println(p);

	}
        

    }
}
