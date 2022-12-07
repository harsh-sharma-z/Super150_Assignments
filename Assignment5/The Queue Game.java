import java.util.*;
public class Main {
   public static boolean check(int a[], int n) {
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] ==1) {
                ones++;
            }
            else {
                ones--;
            }
            if (ones < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            if(check(arr,n))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }

    }
}
