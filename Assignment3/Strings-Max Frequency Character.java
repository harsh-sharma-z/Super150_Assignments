// Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

// Input Format
// String

// Constraints
// A string of length between 1 to 1000.

// Output Format
// Character

// Sample Input
// aaabacb
// Sample Output
// a
// Explanation
// For the given input string, a appear 4 times. Hence, it is the most frequent character.






import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getMaxOccurringChar(s));
    }

	public static char getMaxOccurringChar(String str)
    {
        int count[] = new int[256];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
}
