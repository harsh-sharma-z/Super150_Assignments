import java.util.*;
public class Main {

	public static Stack<Integer> st=new Stack<>();
    static void insert_at_bottom(int x)
    {

        if (st.isEmpty())
            st.push(x);

        else {
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

    static void reverse()
    {
        if (st.size() > 0) {
            int x = st.peek();
            st.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            st.push(a);
        }
        reverse();

        for(int i=0;i<n;i++)
        {
            System.out.println(st.pop());
        }
    }

}
