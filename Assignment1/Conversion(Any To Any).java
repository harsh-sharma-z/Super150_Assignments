// Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 8
// 2 
// 33
// Sample Output
// 11011
// Explanation
// All input output is as integers and in separate lines.



import java.util.*;
public class Main {

	
	
    public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);

		int src=sc.nextInt();
		int des=sc.nextInt();

		String s=sc.next();
		int ans=Integer.parseInt(s,src);


		System.out.print(Integer.toString(ans,des));



    }
}
