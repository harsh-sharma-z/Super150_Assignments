// You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

// Constraints
// 1<=t<=100 1<=n,m<=100000

// Output Format
// Print the maximum path.

// Sample Input
// 1
// 8 8
// 2 3 7 10 12 15 30 34
// 1 5 7 8 10 15 16 19
// Sample Output
// 122
// Explanation
// 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34




import java.util.*;
public class Main {
	public static long max(long x, long y) { return (x > y) ? x : y; }
 

    public static long maxPathSum(long ar1[], long ar2[], int m, int n)
    {
        int i = 0, j = 0;
 
       
        long result = 0, sum1 = 0, sum2 = 0;
 
        while (i < m && j < n) {
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
 
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
 
            else {
                result += max(sum1, sum2) + ar1[i];
 
                sum1 = 0;
                sum2 = 0;
 
                i++;
                j++;
            }
        }
 
        while (i < m)
            sum1 += ar1[i++];
 
        while (j < n)
            sum2 += ar2[j++];
 
        result += max(sum1, sum2);
 
        return result;
    }
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		while(t-- >0)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			long[] ar1=new long[m];
			long[] ar2=new long[n];
			for(int i=0;i<m;i++)
			ar1[i]=sc.nextLong();

			for(int j=0;j<n;j++)
			ar2[j]=sc.nextLong();


			System.out.println(maxPathSum(ar1,ar2,m,n));

		}

    }
}
