// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having a product less than a given number k.

// Input Format
// First line contains Integer where N is the Size of Array
// Second line contains Integer k
// Next N Line Contains an Integer which denotes element of array

// Constraints
// 1<=n<=10^5
// 1<=k<=10^15
// 1<=a[i]<=10^5

// Output Format
// Print number of possible contiguous subarrays having product less than a given number k.

// Sample Input
// 4 
// 10
// 1
// 2 
// 3 
// 4
// Sample Output
// 7
// Explanation
// The contiguous subarrays are {1}, {2}, {3}, {4} {1, 2}, {1, 2, 3} and {2, 3} whose count is 7.







import java.util.*;
public class Main {
   
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;

        int p=1,l=0,r,ans=0;

        for(r=0;r<nums.length;r++)
        {
            p=p*nums[r];
            while(p>=k)
            {
                p=p/nums[l];
                l++;
            }
            ans+=r-l+1;
        }

        return ans;
    }
    
}
