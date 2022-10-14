// You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.

// Example : Imgur

// Input Format
// The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

// Constraints
// 1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

// Output Format
// Print how much unit of water collected among towers for each test case.

// Sample Input
// 2
// 6
// 3  0  0  2  0  4
// 12
// 0  1  0  2  1  0  1  3  2  1  2  1
// Sample Output
// 10
// 6





import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scn= new Scanner(System.in);
       int t =scn.nextInt(); 
       while(t>0)
       {
           int n=scn.nextInt() ; 
           int[] arr = new int[n] ; 
           int leftmax=0 ; 
           int rightmax=0 ; 
           int var1=0 ; 
           int sum=0 ;
           for(int i=0;i<n;i++)
           {
               arr[i]=scn.nextInt();
           }
           
           for(int i=0;i<n;i++)
           {   
              for(int j=i+1;j<n;j++)
              {
                  if(arr[j]>rightmax)
                  rightmax=arr[j]; 
              }
              for(int k=0;k<i;k++)
              {
                  if(arr[k]>leftmax)
                  leftmax=arr[k]; 
              }
              if(leftmax>=rightmax)
              var1=rightmax ; 
              else 
              var1=leftmax ; 
              if(leftmax!=0&&rightmax!=0&&var1>=arr[i])
               { sum=sum+ (var1-arr[i]) ;

               }
              leftmax=0 ; 
              rightmax=0 ; 
           }
           System.out.println(sum); 
           t--; 
           leftmax=0 ; 
           rightmax=0 ; 
           sum=0 ; 
           var1=0 ; 
       }
    }
}
