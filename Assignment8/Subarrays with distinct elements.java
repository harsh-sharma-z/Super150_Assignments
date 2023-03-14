import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Set<Integer> s = new HashSet<>();
        int j = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && !s.contains(arr[j])) {
                s.add(arr[j]);
                j++;
            }
            ans += ((j - i) * (j - i + 1)) / 2;
            s.remove(arr[i]);
        }
        System.out.println(ans);
    }
}
