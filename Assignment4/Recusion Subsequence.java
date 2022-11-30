import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		int n=permutation(s,ans);
		System.out.print("\n"+n);
    }
	public static int permutation(String s,String ans)
    {
        if(s.length()==0)
        {
			
            System.out.print(ans+" ");
            return 1;
        }
        char ch=s.charAt(0);

        return permutation(s.substring(1),ans)+permutation(s.substring(1),ans+ch);
    }
}
