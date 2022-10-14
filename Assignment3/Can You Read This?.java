// One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

// Input Format
// A single line contains the string.

// Constraints
// |S|<=1000

// Output Format
// Print words present in the string, in the order in which it appears in the string.

// Sample Input
// IAmACompetitiveProgrammer
// Sample Output
// I
// Am
// A
// Competitive
// Programmer
// Explanation
// There are 5 words in the string.







import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.trim();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i!=0 && Character.isUpperCase(c))
            {
                System.out.print("\n"+c);
            }
            else
                System.out.print(c);
        }
    }
}
