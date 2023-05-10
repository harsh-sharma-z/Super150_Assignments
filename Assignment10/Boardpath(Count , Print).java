
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int counter_var = ginti_karo_raste_ki(m, n);
        print_karo_raste_ko(m, n, "");
        System.out.println();
        System.out.println(counter_var);
    }

    private static void print_karo_raste_ko(int m, int n, String rasta) {
        if (m == 0) {
            System.out.print(rasta + " ");
            return;
        }
        for (int i = 1; i <= n && i <= m; i++) {
            print_karo_raste_ko(m - i, n, rasta + i);
        }


    }
    private static int ginti_karo_raste_ki(int m, int n) {
        if (m == 0) {
            return 1;
        }
        int counter_var = 0;
        for (int i = 1; i <= n && i <= m; i++) {
            counter_var += ginti_karo_raste_ki(m - i, n);
        }
        return counter_var;
    }



}


