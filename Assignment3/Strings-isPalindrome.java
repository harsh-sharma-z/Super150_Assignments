// Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.

// Input Format
// String

// Constraints
// String length between 1 to 1000 characters

// Output Format
// Boolean

// Sample Input
// abba
// Sample Output
// true
// Explanation
// A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".





import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str="";
        for(int i=s.length()-1;i>=0;i--)
            str=str+s.charAt(i);
       
        if(s.compareTo(str)==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
