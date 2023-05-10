import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            System.out.println(countStrings(n));
        }
    }
    private static long countStrings(int n) {
         long a = 1, b = 1, c;
            for (int i = 1; i <= n; i++) {
                c = b;
                b = a + b;
                a = c;
            }
		return b;
    }
}


