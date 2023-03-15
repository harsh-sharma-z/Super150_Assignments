import java.util.*;
public class Main {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); // min heap by default
        //Collections.reverseOrder for max heap
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]>pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                    arr[i]=sc.nextInt();
        System.out.println(findKthLargest(arr,k));
    }
}
