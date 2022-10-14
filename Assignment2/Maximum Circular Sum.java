// You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

// Input Format
// First line contains integer t which is number of test case.
// For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

// Constraints
// 1<=t<=100
// 1<=n<=1000
// |Ai| <= 10000

// Output Format
// Print the maximum circular sum for each testcase in a new line.

// Sample Input
// 1
// 7
// 8 -8 9 -9 10 -11 12
// Sample Output
// 22
// Explanation
// Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)







import java.util.*;
public class Main {
  
		 public static long maxSubArray(long[] nums) {
        long max_sum = Long.MIN_VALUE;
        long cur=0;
        for(long x:nums)
        {
            if(cur<0) cur=0;
            cur += x;
            max_sum =  Math.max(max_sum , cur);
        }
        return max_sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-- >0)
        {
            int n=sc.nextInt();
            long []nums=new long[n];

            for(int i = 0; i <n ; i++) {
                nums[i]=sc.nextLong();
            }

            System.out.println(maxSubArray(nums));



        }

        }

    }
