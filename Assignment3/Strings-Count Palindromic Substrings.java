// Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes and Print the ans.

// Input Format
// Single line input containing a string

// Constraints
// Length of string is between 1 to 1000.

// Output Format
// Integer output showing the number of palindromic substrings.

// Sample Input
// abc
// Sample Output
// 3
// Explanation
// For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, the ans is 3.





import java.util.*;
public class Main {
    static int ans = 0;

    public static int countSubstrings(String s) {
        int n = s.length();
        char[] ca = s.toCharArray();

        for(int i =0;i<ca.length;i++){
            extendPalindrome(i,i, ca); 
            extendPalindrome(i,i+1, ca); 
        }

        return ans;
    }

    public static void extendPalindrome(int i, int j, char[] ca){
        while( -1 < i && j < ca.length && ca[i--] == ca[j++])
            ans++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(countSubstrings(s));
    }
}
