import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
        int n = sc.nextInt();

//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
        System.out.println(numberOfSteps(n));

//        }
    }

    public static int numberOfSteps (int n) {
        int count = 0;

        while (n > 1)
        {
            count++;

            if (n % 2 == 0)
                n /= 2;

            else if (n % 4 == 1||n==3)
                n -= 1;
            else
                n += 1;
        }
        return count;

    }
}


