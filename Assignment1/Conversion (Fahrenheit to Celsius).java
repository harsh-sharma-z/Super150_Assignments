// Take the following as input.

// Minimum Fahrenheit value
// Maximum Fahrenheit value
// Step

// Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
// 0 -17
// 20 -6
// 40 4
// 60 15
// 80 26
// 100 37

// Input Format
// The first line of the input contains an integer denoting the Minimum Fahrenheit value. The second line of the input contains an integer denoting the Maximum Fahrenheit value. The third line of the input contains an integer denoting the Step.

// Constraints
// 0 < Min < 100 Min < Max < 500 0 < Step

// Output Format
// Print Fahrenheit and Celsius values separated by a tab. Each step should be printed in a new line.

// Sample Input
// 0 
// 100 
// 20
// Sample Output
// 0 -17 
// 20 -6 
// 40 4 
// 60 15 
// 80 26 
// 100 37
// Explanation
// First number in every output line is fahrenheit, second number is celsius. The two numbers are separated by a tab.




import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        int least,maxi,inc;
        least=sc.nextInt();
        maxi= sc.nextInt();
        inc=sc.nextInt();

        for(int i=least;i<=maxi;i=i+inc)
        {
			int h=5*(i-32);
            int ans=h/9;
            System.out.println(i+" "+ans );
        }
    }
}
