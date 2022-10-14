// Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 63
// Sample Output
// 77
// Explanation
// Both input and output are integers


import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int s=sc.nextInt();

		System.out.println(Integer.toOctalString(s)); 
        // Your Code Here
    }
}
