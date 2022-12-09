import java.util.*;

public class Main {
    public static int count(int n)
    {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return (n - 1) * (count(n - 1) +
                count(n - 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
