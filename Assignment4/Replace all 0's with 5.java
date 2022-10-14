// Given an integer N, now you have to convert all zeros of N to 5.

// Input Format
// The first Line takes input integer N, denoting the number.

// Constraints
// 1<=N<=10000

// Output Format
// Print the number after replacing all 0's with 5.

// Sample Input
// 103
// Sample Output
// 153
// Explanation
// Testcase 1: after replacing 0 with 5 ,number will become 153.
// Testcase 2: there is no zero in number so it will remain same.







import java.util.*;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String s=sc.next();
            removeZero(s,0);

    }

    public static void removeZero(String s,int i) {
        if(i>=s.length())
            return;
        if(s.charAt(i)=='0')
            System.out.print("5");
        else
            System.out.print(s.charAt(i));

        removeZero(s,i+1);


    }
}
