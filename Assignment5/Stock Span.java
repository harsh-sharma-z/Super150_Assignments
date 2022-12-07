import java.util.*;
public class Main {

	public static void main(String args[])  {
		// Your Code Here
	 Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int price[]=new int[n];
        int S[]=new int[n];
        for(int i=0;i<n;i++)
        {
            price[i]=sc.nextInt();
        }
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            S[i] = 1;
            for (int j = i - 1;
                 (j >= 0) && (price[i] >= price[j]); j--)
                S[i]++;
        }
        for(int i:S)
            System.out.print(i+" ");
        System.out.print("END");

	}

}

