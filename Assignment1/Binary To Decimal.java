// Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 101010
// Sample Output
// 42
// Explanation
// For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.


import java.util.*;
public class Main {
	
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();  
	int n=Integer.parseInt(s,2);  
	System.out.println(n);  

    }
}
