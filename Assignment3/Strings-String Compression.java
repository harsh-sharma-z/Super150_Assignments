// Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

// Input Format
// A single String S.

// Constraints
// A string of length between 1 to 1000

// Output Format
// The compressed String.

// Sample Input
// aaabbccds
// Sample Output
// a3b2c2ds
// Explanation
// In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.






import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		int cnt=1;
		int n=s.length();
        for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				cnt++;
				continue;
			}
			else
			{
				System.out.print(s.charAt(i));
				if(cnt!=1)
				{
					System.out.print(cnt);
				}
				cnt=1;
			}
		}
        System.out.print(s.charAt(n-1));
		if(cnt!=1)
		{
			System.out.println(cnt);
		}
    }
}
