// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

// Input Format
// Enter a number N and add N more numbers to an array, then enter number M to be searched

// Constraints
// None

// Output Format
// Display the last index at which the number M is found

// Sample Input
// 5
// 3
// 2
// 1
// 2
// 3
// 2
// Sample Output
// 3





import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();

        System.out.println(print(arr,arr.length-1,k));
    }
    public static int print(int []arr,int i,int k)
    {
		if(i<0)
           return -1;
        if(arr[i]==k && i>=0)
            return i;
       
        return print(arr,i-1,k);

    }
}
