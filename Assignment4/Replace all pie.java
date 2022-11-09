// Replace all occurrences of pi with 3.14

// Input Format
// Integer N, no of lines with one string per line

// Constraints
// 0 < N < 1000
// 0 <= len(str) < 1000

// Output Format
// Output result one per line

// Sample Input
// 3
// xpix
// xabpixx3.15x
// xpipippixx
// Sample Output
// x3.14x
// xab3.14xx3.15x
// x3.143.14p3.14xx
// Explanation
// All occurrences of pi have been replaced with "3.14".








import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String s=sc.next();
            
            System.out.println(removePi(s));
        }
    }

    public static String removePi(String s) {
        int start=0;
        int end=2;
        
        while(end<s.length())
        {
            if(s.substring(start,end).equals("pi"))
                s=s.substring(0,start)+"3.14"+s.substring(end);
			start++;
        	end++;
        }
        
        return s;
    }
      
            
}
