import java.util.*;
public class Main {
    public static int checkFun(int[] arr, int ele)
    {
        for (int i=0; i<arr.length; i++)
            if (arr[i] == ele)
                return i;
        return -1;
    }
    public static void replaceHelp(int[] a, int n, int k)
    {
        int[] oni = new int[k + 1];
        HashMap<Integer, Integer> uwu = new HashMap<>();
        for (int i=0; i<k+1; i++)
            uwu.put(i, 0);
        for (int m=0; m<n; m++) {
            if (uwu.containsKey(a[m]))
                uwu.put(a[m], uwu.get(a[m]) + 1);
            else
                uwu.put(a[m], 1);
            oni[k] = a[m];
            int i = checkFun(oni, a[m]);
            i -= 1;
            while (i>=0) {
                if (uwu.get(oni[i]) < uwu.get(oni[i + 1])) {
                    int temp = oni[i];
                    oni[i] = oni[i + 1];
                    oni[i + 1] = temp;
                }
                else if ((uwu.get(oni[i]) == uwu.get(oni[i + 1])) && (oni[i] > oni[i + 1])) {
                    int temp = oni[i];
                    oni[i] = oni[i + 1];
                    oni[i + 1] = temp;
                }
                else
                    break;
                i -= 1;
            }
            for (int j=0; j<k && oni[j]!=0; ++j)
                System.out.print(oni[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                    arr[i]=sc.nextInt();
                replaceHelp(arr,n,k);
            }
    }
}
