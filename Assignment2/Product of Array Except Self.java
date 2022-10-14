// Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

// Input Format
// First line contains integer N as size of array.
// Next line contains a N integer as element of array.

// Constraints
// arr[i]<=10000000

// Output Format
// print output array

// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 24 12 8 6 







import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long nums[]=new long[n];
        for (int i = 0; i <n ; i++) {
            nums[i]= sc.nextInt();
        }


        long left[]=new long[nums.length];
        long right[]=new long[nums.length];

        long pl=1,pr=1;
        for(int i=0;i<nums.length;i++)
        {
            left[i]=pl;
            pl*=nums[i];
            right[nums.length-i-1]=pr;
            pr*=nums[nums.length-i-1];
        }

        for(int i=0;i<nums.length;i++)
            nums[i]=left[i]*right[i];

        for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
