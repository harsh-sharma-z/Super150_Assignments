// You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

// Input Format
// First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.

// Constraints
// 1 < t < 50
// 1< n < 100
// 1< m <= 50
// 1 <= Ai <= 1000

// Output Format
// Print the maximum number of pages that can be assigned to students.

// Sample Input
// 1
// 4 2
// 12 34 67 90
// Sample Output
// 113 
// Explanation
// 1st students : 12 , 34, 67 (total = 113)
// 2nd students : 90 (total = 90)
// Print max(113, 90)






import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int t=sc.nextInt();
        for(int h=0;h<t;h++)
        {
            int n=sc.nextInt();
            long m=sc.nextInt();
            long arr[]=new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println(findPages(arr,n,m));
        }

    }

    static boolean isPossible(long arr[], int n, long m, long curr_min)
    {
        long studentsRequired = 1;
        long curr_sum = 0;
        for(int i=0;i<n;i++)
        {
            curr_sum += arr[i];
            if(curr_sum > curr_min)
            {
                studentsRequired++ ;

                curr_sum = arr[i] ;
            }
        }

        return studentsRequired <= m;
    }

    static long findPages(long arr[], int n, long m)
    {
        long sum = 0;


        if (n < m)  return -1;

        for (int i = 0; i < n; i++)  sum += arr[i];

        long start = arr[n-1], end = sum;
        long result = Integer.MAX_VALUE;

        while (start <= end)
        {
            int mid = (int)(start + (end - start)/2);
            if (isPossible(arr, n, m, mid))
            {
                result = mid;
                end = mid - 1;
            }

            else
                start = mid + 1;
        }

        return result;
    }
}
