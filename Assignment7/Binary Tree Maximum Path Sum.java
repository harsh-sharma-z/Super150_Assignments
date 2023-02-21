import java.util.*;

public class Main {
    static int minSum = Integer.MIN_VALUE;
    public static int uwuSum(Node yt) {
        minSum(yt);
        return minSum;
    }
    private static int minSum(Node yt) {
        if (yt == null) {
            return 0;
        }
        int leftSum = minSum(yt.lt);
        int rightValaSum = minSum(yt.rg);
        int abhiValaSum = yt.gtr;
        if (leftSum > 0) {
            abhiValaSum += leftSum;
        }
        if (rightValaSum > 0) {
            abhiValaSum += rightValaSum;
        }
        minSum = Math.max(minSum, abhiValaSum);
        return Math.max(yt.gtr + Math.max(leftSum, rightValaSum), 0);
    }
    public static void main(String[] args) {
        Scanner scnInputWallah = new Scanner(System.in);
        Queue<Node> queuewuwuwuw= new LinkedList<>();
        int[] it = Arrays.stream(scnInputWallah.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Node yt = new Node(it[0]);
        queuewuwuwuw.offer(yt);
        int counterVariable= 1;
        while (!queuewuwuwuw.isEmpty() && counterVariable < it.length) 
        {
            Node node = queuewuwuwuw.poll();
            if (it[counterVariable] != -1) 
            {
                node.lt = new Node(it[counterVariable]);
                queuewuwuwuw.offer(node.lt);
            }
            counterVariable++;
            if (it[counterVariable] != -1) 
            {
                node.rg = new Node(it[counterVariable]);
                queuewuwuwuw.offer(node.rg);
            }
            counterVariable++;
        }
        System.out.println(uwuSum(yt));
    }
}


class Node {
    int gtr;
    Node lt;
    Node rg;
    Node(int gtr) {
        this.gtr = gtr;
        this.lt = null;
        this.rg = null;
    }
}
