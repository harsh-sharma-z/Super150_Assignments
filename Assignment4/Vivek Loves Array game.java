// Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as follows:

// Initially, there is an array, A , containing 'N' integers.

// In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

// After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
// the remaining partition as array 'A'.

// Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?

// Input Format
// First line of input contains an integer T denoting number of test cases. Each further Test case contains first line an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.

// Constraints
// 1 <= T <= 10 1 <= N <= 17000 0 <= A[i] <= 10^9

// Output Format
// For each test case, print Vivek's maximum possible score on a new line.

// Sample Input
// 3
// 3
// 3 3 3
// 4
// 2 2 2 2
// 7
// 4 1 0 1 1 0 1
// Sample Output
// 0
// 2
// 3









import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();



		while (t-- > 0) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}



			System.out.println(Loves(arr, 0, n - 1));
		}

	}

	public static int Loves(int[] arr, int si, int ei) {

		for (int mid = si; mid < ei; mid++) {

			int sum1 = 0;
			for (int i = si; i <= mid; i++) {
				sum1 += arr[i];

			}
			int sum2 = 0;
			for (int i = mid+1; i <= ei; i++) {
				sum2 += arr[i];

			}
			

			if(sum1==sum2) {
				int lf = Loves(arr, si, mid);

				int rf = Loves(arr, mid+1, ei);

				return Math.max(lf, rf)+1;
				
				
			}

		}
		return 0;

	}

}
