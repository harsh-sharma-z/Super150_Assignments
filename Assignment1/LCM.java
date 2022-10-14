// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned.

// Input Format
// Constraints
// 0 < N1 < 1000000000
// 0 < N2 < 1000000000

// Output Format
// Sample Input
// 4 
// 6
// Sample Output
// 12
// Explanation
// The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.




import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=Math.max(x,y);
		int b=Math.min(x,y);

		if(a%b==0)
		System.out.println(a);
		else{
			int ans=a;
			for(int i=a;i>0;i++ )
			{
				if(i%a==0 && i%b==0)
				{
					ans=i;
					break;
				}
			}
			System.out.println(ans);

    }
	}
}
