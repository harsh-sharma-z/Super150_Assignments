import java.util.*;
public class Main {
    public static boolean knows(int a, int b, int[][] MATRIX)
    {
        boolean res = (MATRIX[a][b] == 1) ? true : false;
        return res;
    }
    static int findCelebrity(int n,int [][]MATRIX)
    {
        Stack<Integer> st = new Stack<>();
        int c;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (knows(a, b,MATRIX)) {
                st.push(b);
            }
            else
                st.push(a);
        }
        if (st.empty())
            return -1;
        c = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != c && (knows(c, i,MATRIX) || !knows(i, c,MATRIX)))
                return -1;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] MATRIX =new int[n][n];

        for (int i = 0; i <n ; i++) {
            for(int j=0;j<n;j++) {
                MATRIX[i][j]=sc.nextInt();
            }
        }

        int result = findCelebrity(n,MATRIX);
        if (result == -1) {
            System.out.println("No Celebrity");
        }
        else
            System.out.println( result);


    }
}
