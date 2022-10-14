// You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

// Input Format
// First line contains number of test cases, T. Next T lines contains integers, n and k.

// Constraints
// 1<=T<=10
// 1<=N<=10^15
// 1<=K<=10^4

// Output Format
// Output the integer x

// Sample Input
// 2
// 10000 1
// 1000000000000000 10
// Sample Output
// 10000
// 31
// Explanation
// For the first test case, for x=10000, 10000^1=10000=n




import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            long n=sc.nextLong();
            int k=sc.nextInt();
            long l=1,r=(n/k)+1;
            long m=0;
            long ans=0;
            while(l<=r)
            {
                m=(l+r)/2;

                if(Math.pow(m,k)==n){
                    ans=m;
                    break;}
                else if(Math.pow(m,k)<n){
                    ans=m;
                    l=m+1;}
                else{
                    ans=m-1;
                    r=m-1;}
            }

//        if(m*m==n)
            System.out.println(ans);
    }
}
}
