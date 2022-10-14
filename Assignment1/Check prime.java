// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

// Input Format
// Constraints
// 2 < N <= 1000000000

// Output Format
// Sample Input
// 3
// Sample Output
// Prime
// Explanation
// The output is case specific




import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println("Prime");
    else
      System.out.println("Not Prime");

    }
}
