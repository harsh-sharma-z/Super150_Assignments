// Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.

// Input Format
// The first line contains T denoting the number of testcases. Then follows description of testcases. Each case begins with a single integer N denoting the length of string. The next line contains the string S.

// Constraints
// Output Format
// For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.

// Sample Input
// 3
// codingblocks
// abbac
// java
// Sample Output
// d
// c
// j







import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            String s = sc.next();
            int index = firstUniqChar(s);

            if(index==-1)
                System.out.println("-1");
            else
                System.out.println(s.charAt(index));
        }
    }

    public static int firstUniqChar(String s) {
        int ans=s.length()+1;

        int first , last;

        for(char c='a'; c<='z'; c++)
        {

            first=s.indexOf(c);

            if(first!=-1 && first==s.lastIndexOf(c))
                ans=Math.min(ans,first);

        }


        if(ans<s.length()+1)
            return ans;
        return -1;
    }
}
