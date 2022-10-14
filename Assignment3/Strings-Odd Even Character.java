// Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.

// Input Format
// String

// Constraints
// Length of string should be between 1 to 1000.

// Output Format
// String

// Sample Input
// abcg
// Sample Output
// badf








import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i%2==0)
            {
                System.out.print((char)(c+1));
            }
            else
            {
                System.out.print((char)(c-1));
            }
        }
    }
}

