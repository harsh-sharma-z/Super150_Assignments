import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)
//        {
        int n=sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(help(arr,n));

//        }
    }

    private static int help(int[] nums,int n) {
        if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int[] dp1 = new int[n - 1];
            dp1[0] = nums[0];
            dp1[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < n - 1; i++) {
                dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + nums[i]);
            }
            int max1 = dp1[n - 2];

            int[] dp2 = new int[n];
            dp2[1] = nums[1];
            dp2[2] = Math.max(nums[1], nums[2]);
            for (int i = 3; i < n; i++) {
                dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i]);
            }
            int max2 = dp2[n - 1];

            return Math.max(max1, max2);
        }
    }
}


