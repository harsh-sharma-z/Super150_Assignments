import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q4 = new LinkedList<>();
        Queue<Integer> group = new LinkedList<>();

        int n = sc.nextInt();
        while (n-- > 0) {
            char ch = sc.next().charAt(0);
            if (ch == 'E') {
                int c, r;
                c = sc.nextInt();
                r = sc.nextInt();
                if (c == 1) {
                    if (q1.isEmpty()) {
                        group.add(1);
                    }
                    q1.add(r);
                } else if (c == 2) {
                    if (q2.isEmpty()) {
                        group.add(2);
                    }
                    q2.add(r);
                } else if (c == 3) {
                    if (q3.isEmpty()) {
                        group.add(3);
                    }
                    q3.add(r);
                } else if (c == 4) {
                    if (q4.isEmpty()) {
                        group.add(4);
                    }
                    q4.add(r);
                }
            }
            else if(ch=='D'){
                int first = group.peek();

                if(first==1){
                    System.out.println("1 "+q1.peek());
                    q1.remove();
                    if(q1.isEmpty()){
                        group.remove();
                    }
                }else if(first==2){
                    System.out.println("2 "+q2.peek());
                    q2.remove();
                    if(q2.isEmpty()){
                        group.remove();
                    }
                }else if(first==3){
                    System.out.println("3 "+q3.peek());
                    q3.remove();
                    if(q3.isEmpty()){
                        group.remove();
                    }
                }else if(first==4){
                    System.out.println("4 "+q4.peek());
                    q4.remove();
                    if(q4.isEmpty()){
                        group.remove();
                    }
                }

            }
        }
    }
}
